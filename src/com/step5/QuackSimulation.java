package com.step5;
//인스턴스화 4: 인터페이스 변수명 = new 구현체클래스();
//인스턴스화 5 : 추상클래스 변수명 = new 구현체클래스();
//4,5모두 다형성을 누릴 수 있다.
public class QuackSimulation {
	void methodA(Squeak squeak) {
		System.out.println("methodA "+squeak);
	}
	void methodB(QuackBehavior quackBehavior) {
		System.out.println("methodB "+ quackBehavior);		
	}
	public static void main(String[] args) {
		//선언부와 생성부에 타입이 다른거 - 권장사항 - 범위가 더 넓은 걸
		//사용하면 범위가 더 좁은 여러개의 구현체 클래스를 담을 수 있으니까
		//유지보수시에 코드의 수정을 최소화 하는데 역할이 있다.
		QuackSimulation qs = new QuackSimulation();
		QuackBehavior quackBehavior = new Squeak();
		MuteQuack quackBehavior1 = new MuteQuack();
		//qs.methodA(quackBehavior1);
		if(quackBehavior instanceof Squeak) {
			System.out.println("나는 Squak타입이다.");
		}
		if(quackBehavior instanceof MuteQuack) {
			System.out.println("나는 MuteQuack타입이다.");
		}
		if(quackBehavior instanceof Quack) {
			System.out.println("나는 Quack타입이다.");
		}
		qs.methodB(quackBehavior1);
		Quack quackBehavior2 = new Quack();
		Squeak quackBehavior3 = new Squeak();
	    quackBehavior.quack();
	}

}
