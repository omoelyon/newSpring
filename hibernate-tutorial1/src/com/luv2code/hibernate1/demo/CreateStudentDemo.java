package com.luv2code.hibernate1.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate1.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		System.out.println("here is the start");
		//create session factory
		
		try {
			SessionFactory factory = new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Student.class)
					.buildSessionFactory();
			System.out.println("i got here");
			Session session = factory.getCurrentSession();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//create session
		
		System.out.println("here b4 try block");
//		try {
//			//create a student object
//			System.out.println("creating a new student object");
//			Student tempStudent =new Student("paul", "Rick", "paul@luv2code.com");
//			
//			//start a transaction
//			session.beginTransaction();
//			
//			System.out.println("saving the object");
//			session.save(tempStudent);
//			
//			session.getTransaction().commit();
//			
//			System.out.println("done");
//			
//		}
//		finally {
//			factory.close();
//		}

	}

}
