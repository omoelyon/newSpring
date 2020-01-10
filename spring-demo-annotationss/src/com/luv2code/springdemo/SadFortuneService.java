package com.luv2code.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		return "today is not a sad day";
	}

}
