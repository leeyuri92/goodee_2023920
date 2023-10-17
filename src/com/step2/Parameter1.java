package com.step2;

public class Parameter1 {
	void m(String[] nos) {
		for(String no:nos) {
			System.out.println(no);
		}
	}
	public static void main(String[] args) {
		Parameter1 p1 = new Parameter1();
		String[] nos = {"1","2","3"};
	}

}
