package com.week1;

public class MethodCall {
	void methodA() {
		System.out.println("methodA");
	}
	void methodB() {
		System.out.println("methodB");
		// methodB() 안에서 methodA()를 호출하는 것도 합법이다.
		methodA();		
	}

	public static void main(String[] args) {
		MethodCall mc = new MethodCall();
		mc.methodA();  // A만 호출
		mc.methodB();  // B와 A 둘다 호출 
	}
}
