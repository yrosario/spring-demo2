package com.spring.demo;

public class BaseballCoach implements Coach{
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theForturneService) {
		fortuneService = theForturneService;
	}

	
}
