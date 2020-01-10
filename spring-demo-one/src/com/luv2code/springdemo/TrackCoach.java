package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return " just do it: "+fortuneService.getFortune();
	}
	
	public void doMyStartupStuff() {
		System.out.println("this is my init method : doMyStartupStuff");
	}
	
	public void doMyCleanupStuffYoYo() {
		System.out.println("this is my destroy method : doMyCleanupStuffyoyoyo");
	}

}
