package com.step3;

import java.util.Random;

public class Return1 {
	void m() {
		System.out.println("리턴타입 자리에 void인 경우 = 반환값을 받을 수 없다.");
	}
	int m2() {
		System.out.println("리턴타입 자리에 XXX인 경우 = 반환값을 받을 수 있다. ");
		return 0;	
	}
	String m3() {
		System.out.println("리턴타입 자리에 XXX인 경우 = 반환값을 받을 수 있다. ");
		return "높여라";
	}
	Random m4() {
		return new Random();
	}
	Random m5() {
		Random r = new Random();
		return r;
 	}	
	public static void main(String[] args) {
		Return1 r1 = new Return1();
		 
		// int i = r1.m();
		// System.out.println(r1.m1());  
		
		int i = r1.m2();
		System.out.println(r1.m2());  // 0
		System.out.println(r1.m3());  // 높여라
		System.out.println(r1.m4());  // java.util.Random@4e50df2e
		System.out.println(r1.m5());  // java.util.Random@1d81eb93
		System.out.println(r1.m4().nextInt(10));  // 0 ~ 10 사이의 랜덤한 숫자
		System.out.println(r1.m5().nextInt(5));  // 0 ~ 5 사이의 랜덤한 숫자
	}
}
