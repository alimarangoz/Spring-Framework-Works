package com.ali.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring configuration
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean form spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		System.out.println("\nPointing to the same object: "+result);
		
		System.out.println("\nMemory Location for theCoach: "+theCoach);
		
		System.out.println("\nMemory Location for alphaCoach: "+alphaCoach);
		
		context.close();

	}

}
