package com.step5;

public class RubberDuck extends Duck {

	public RubberDuck() {
		//날고 있어요 - FlyWithWings.java-> implements FlyBehavior
		//날수 없어요 - FlyNoWay.java -> implements FlyBehavior
		flyBehavior = new FlyNoWay();//FlyBehavior의 구현체 클래스로 결정할 수 있음
	}
	@Override
	public void display() {
		System.out.println("나는 고무오리입니다.");
	}

}
