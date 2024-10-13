package com.acc.SpringDemo1.model;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "you are lucky";
	}

	@Override
	public String toString() {
		return "HappyFortuneService [getFortune()=" + getFortune() + "]";
	}
	
	

}
