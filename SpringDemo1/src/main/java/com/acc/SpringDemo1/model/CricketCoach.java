package com.acc.SpringDemo1.model;

import java.util.List;
import java.util.Set;

public class CricketCoach implements Coach {
	private String email;
	private String team;
	private List<String> owners;
	private Set<Integer> winYears;
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public List<String> getOwners() {
		return owners;
	}

	public void setOwners(List<String> owners) {
		this.owners = owners;
	}

	public Set<Integer> getWinYears() {
		return winYears;
	}

	public void setWinYears(Set<Integer> winYears) {
		this.winYears = winYears;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String toString() {
		return "CricketCoach [email=" + email + ", team=" + team + ", owners=" + owners + ", winYears=" + winYears
				+ ", fortuneService=" + fortuneService.getFortune() + "]";
	}
	
	
}
