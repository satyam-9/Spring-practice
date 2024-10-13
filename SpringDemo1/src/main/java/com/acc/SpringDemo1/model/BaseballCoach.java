package com.acc.SpringDemo1.model;

public class BaseballCoach implements Coach {
	
	FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Baseball class";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	

}
