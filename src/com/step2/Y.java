package com.step2;

public class Y {
	int i =0;
	Y y = null;
	void m() {
		y = new Y();
	}
	void m2() {
		System.out.println(y.i);//0
	}
	public static void main(String[] args) {
		

	}

}
