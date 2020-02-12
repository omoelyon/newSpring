package com.luv2code.hibernate1.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate1.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		//create session factory
		
		
				SessionFactory factory = new Configuration()
						.configure()
						.addAnnotatedClass(Student.class)
						.buildSessionFactory();
				
				Session session = factory.getCurrentSession();
		
			//create session

				try {
			
				//create a student object
				System.out.println("creating a new student object");
				Student tempStudent =new Student("Daffy", "Doe", "Daffy@luv2code.com");
				
				//start a transaction
				session.beginTransaction();
				
				System.out.println("saving the object");
				System.out.println(tempStudent);
				session.save(tempStudent);
				
				session.getTransaction().commit();
				//new code
				
				//find out the student's id: primary key
				System.out.println("saved student. Generated id: " + tempStudent.getId());
				
				//get a new session and start transaction
				session = factory.getCurrentSession();
				
				session.beginTransaction();
				
				//retrieve student based on the id: primary key
				System.out.println("\nGetting student with id: "+ tempStudent.getId());
				
				Student myStudent = session.get(Student.class, tempStudent.getId());
				System.out.println("get complete: "+ myStudent);
				//commit the transaction
				
				session.getTransaction().commit();
				
				
				System.out.println("done");
				
				
				
			}
			finally{
				factory.close();
			}
			
	

		}

}
