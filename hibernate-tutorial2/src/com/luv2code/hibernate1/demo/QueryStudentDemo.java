package com.luv2code.hibernate1.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate1.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		//create session factory
				SessionFactory factory = new Configuration()
						.configure()
						.addAnnotatedClass(Student.class)
						.buildSessionFactory();
				
				Session session = factory.getCurrentSession();
		
			//create session
				try {
				//start transaction
				
				session.beginTransaction();
				
				//query students
				List<Student> theStudents = session.createQuery("from Student").getResultList();
				
				//display students
				displayStudents(theStudents);
				//query student whose last name is doe
				theStudents = session.createQuery("from Student s where s.firstName='Paul'").getResultList();
				
				System.out.println("\n\nstudents who have last name as doe");
				displayStudents(theStudents);
				
				System.out.println("\n\nstudents who have last name as doe or first name daffy");
				theStudents = session.createQuery("from Student s where s.lastName='Doe' OR s.firstName='Daffy'").getResultList();
				displayStudents(theStudents);
				

				System.out.println("\n\nstudents who email ending with %luv2code.com ");
				theStudents = session.createQuery("from Student s where s.email LIKE '%luv2code.com'").getResultList();
				displayStudents(theStudents);
				
				//commit the transaction
				
				session.getTransaction().commit();
				System.out.println("done");
			}
			catch(Exception e) {
				System.out.println(e);
			}
			finally{
				factory.close();
			}
		}

	private static void displayStudents(List<Student> theStudents) {
		for(Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

}
