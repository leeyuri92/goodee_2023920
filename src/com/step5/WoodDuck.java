package com.step5;

public class WoodDuck extends Duck {
	WoodDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
