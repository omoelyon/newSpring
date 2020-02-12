package com.luv2code.hibernate1.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate1.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		//create session factory
		
		
				SessionFactory factory = new Configuration()
						.configure()
						.addAnnotatedClass(Student.class)
						.buildSessionFactory();
				
				Session session = factory.getCurrentSession();
		
			//create session

				try {
			int studentId = 5;
				
				//get a new session and start transaction
				session = factory.getCurrentSession();
				
				session.beginTransaction();
				
				//retrieve student based on the id: primary key
//				System.out.println("\nGetting student with id: "+ studentId);
				
				Student myStudent = session.get(Student.class, studentId);
			//delete my student
//				session.delete(myStudent);
//				System.out.println("deleting student...");
				
				System.out.println("deleting student with id of 2");
				
				session.createQuery("delete Student where id=2").executeUpdate();
				
				
			//commit transaction	
				session.getTransaction().commit();
				
				System.out.println("done");
				
				
				
			}
			finally{
				factory.close();
			}
			
	

		}

}
