package com.spring.demo;

public class TrackCoach implements Coach{
	
	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	// add an init method
	public void doMyStartUpSfuff() {
		System.out.println("TrackCoach: inside metohd doMystartUpSfuff");
	}
	
	// add a destroy method
	public void doMyCleanUpSfuff() {
		System.out.println("TrackCoach: inside metohd doMyCleanUpSfuff");
	}
	
	
}
