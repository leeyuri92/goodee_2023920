package com.week1;

public class Print1 {
	static int m() {return 5;}
	static void n() {}

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println("안녕");
		System.out.println(1.5);
		System.out.println(true);
		System.out.println(Print1.m());
		System.out.println("============");
		// System.out.println(Print1.n());  void는 return이 없기때문에 호출불가

	}

}
