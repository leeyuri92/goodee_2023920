package com.step5;

public class MallardDuck extends Duck{
	MallardDuck(){
		flyBehavior = new FlyWithWings();
	}
	@Override
	public void display() {
		System.out.println("나는 청둥오리 입니다.");
	}

}
