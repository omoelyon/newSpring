package com.luv2code.springdemo;

public class BaseballCoach implements  Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 minutes on batting lessons";
	}

	@Override
	public String getDailyFortune() {
		//use my fortune service to get fortune
		return fortuneService.getFortune();
	}

}
