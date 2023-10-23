package com.step5;

public class Squeak implements QuackBehavior {
	//추상메소드를 재정의하는 것이다.
	@Override
	public void quack() {
		System.out.println("삐이잌 삑~~~");
	}

}
