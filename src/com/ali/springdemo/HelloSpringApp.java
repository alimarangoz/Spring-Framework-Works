package com.ali.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load spring conf
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve beans from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		//close context
		context.close();

	}

}
