package com.step5;
//추상클래스
//추상클래스는 추상메소드와 일반메소드 모두를 가짐
//생성자도 가짐
//변수선언도 가능함
//인터페이스는 일반메소드는 못가짐
//추상클래스와 인터페이스의 공통점은 둘다 반드시 구현체 클래스가 있어야 함
//추상클래스의 구현체 일땐 extends사용
//인터페이스의 구현체 일땐 implements사용
public abstract class Duck {
	FlyBehavior flyBehavior= null;
	QuackBehavior quackBehavior = null;
	public Duck() {}
	public abstract void display();
	public void performFly() {
		flyBehavior.fly();
	}
	public void performQuack() {
		quackBehavior.quack();
	}
	public void swimming() {
		System.out.println("모든 오리는 물위에 뜬다.");
	}
}
