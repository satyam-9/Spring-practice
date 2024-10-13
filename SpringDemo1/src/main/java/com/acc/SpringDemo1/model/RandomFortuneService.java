package com.acc.SpringDemo1.model;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	private String[] fortunes = {
			"Today is your lucky day!",
	        "You will achieve your goals!",
	        "Success is on the horizon!"
	};
	
	@Override
	public String getFortune() {
		Random random = new Random();
		int index = random.nextInt(fortunes.length);
		return fortunes[index];
	}

}
