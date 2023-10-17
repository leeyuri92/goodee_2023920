package com.step21;

public class Z {
	int i = 1;
	void m1() {
	Z z =  new Z();
	System.out.println(z); // 
	System.out.println(z.i); // 1 출력
	m2(z);
	}
	void m2(Z z) {
		// 여기에서 6번에 생성된 주소번지를 굳이 사용하고 싶다.
		System.out.println(z);
	}
	public static void main(String[] args) {
		Z zm = new Z();
		zm.m1();
	}
}
