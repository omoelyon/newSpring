package com.luv2code.hibernate1.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate1.demo.entity.Instructor;
import com.luv2code.hibernate1.demo.entity.InstructorDetail;
import com.luv2code.hibernate1.demo.entity.Student;

public class CreateDemo {

	public static void main(String[] args) {		
			
				SessionFactory factory = new Configuration()
						.configure()
						.addAnnotatedClass(Instructor.class)
						.addAnnotatedClass(InstructorDetail.class)
						.buildSessionFactory();
				
				Session session = factory.getCurrentSession();
		
				try {
					//create the object
					Instructor tempInstructor =
							new Instructor("chad","darby","darby@luv2code.com");
					
					InstructorDetail tempInstructorDetail =
							new InstructorDetail(
									"http://www.luv2code.com/youtube",
									"love to code!!");
					
					//associate the objects
					tempInstructor.setInstructorDetail(tempInstructorDetail);
					
				//start a transaction
				session.beginTransaction();
				
				//save the instructor
				//this saves the instructor details also because of the cascade.all
				System.out.println("saving the instructor : "+ tempInstructor);
				session.save(tempInstructor);
				
				session.getTransaction().commit();
				
				System.out.println("done");
				}
				catch(Exception e) {
					System.out.println(e);
				}
				finally {
					factory.close();				
				}
			
	

		}

}
