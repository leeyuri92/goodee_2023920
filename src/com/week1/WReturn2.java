package com.week1;

public class WReturn2 {
	int i; // 전변i
	void methodA() {
		int i =2;		
		System.out.println(i);
	}
	int methodB() {
		int i = 1; // 지변i
		System.out.println(i);
		return i; //1
	}
	public static void main(String[] args) {
		WReturn2 wr = new WReturn2();
		System.out.println(wr.i);  // 전변출력
		
		wr.methodA();
		// System.out.println(wr.methodA());  리턴타입이 아니라 불가
		
		wr.methodB();  
		System.out.println(wr.methodB()); 
		
	}
}
