package com.luv2code.hibernate1.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate1.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();

	//create session
	
		try {
		//create a student object
		System.out.println("creating a new student object");
		Student student1 =new Student("paul", "Rick", "paul@luv2code.com");
		Student student2 =new Student("remi", "fola", "remi@luv2code.com");
		Student student3 =new Student("esupofo", "ragnorok", "ragnorok@luv2code.com");
		
		//start a transaction
		session.beginTransaction();
		
		System.out.println("saving the object");
		session.save(student1);
		session.save(student2);
		session.save(student3);
		
		session.getTransaction().commit();
		
		System.out.println("done");
		
	}
	finally {
		factory.close();
	}

	}

}
