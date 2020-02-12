package com.luv2code.hibernate1.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate1.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		//create session factory
		
		
			try {
				SessionFactory factory = new Configuration()
						.configure()
						.addAnnotatedClass(Student.class)
						.buildSessionFactory();
				
				Session session = factory.getCurrentSession();
		
			//create session
			
			
				//create a student object
				System.out.println("creating a new student object");
				Student tempStudent =new Student("paul", "Rick", "paul@luv2code.com");
				
				//start a transaction
				session.beginTransaction();
				
				System.out.println("saving the object");
				session.save(tempStudent);
				
				session.getTransaction().commit();
				
				System.out.println("done");
				factory.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
	

		}

}
