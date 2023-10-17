package com.step5;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<<무음. 조용~~~>>");
	}

}
