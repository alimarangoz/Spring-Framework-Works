package com.ali.springdemo;

public class BaseballCoach implements Coach {
	
	//private field for the dependency
	private FortuneService fortuneService;
	
	//constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
