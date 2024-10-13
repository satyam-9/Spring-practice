package com.acc.SpringDemo1.model;



public class TrackCoach implements Coach{
	
	FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "track coach";
	}
	
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void initMethod() {
		System.out.println("inside init method");
	}
	
	public void destroyMethod() {
		System.out.println("inside destroy method");
	}
	

}
