package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if they are
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nPointing to the same object" + result);
		
		System.out.println("\naddress in memory :   " + theCoach);
		
		System.out.println("\nmemory location for alphaCoach :   " + alphaCoach+ "\n");
		
		//close the context
		context.close();

	}

}
