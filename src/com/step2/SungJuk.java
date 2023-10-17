package com.step2;

public class SungJuk {
	
	public int total(int n1, int n2, int n3) {
		return n1+n2+n3;		
	}
	public double avg() {
		int result = total(75, 85, 85);
		return result/3.0;		
	}
	public static void main(String[] args) {
		SungJuk sJ = new SungJuk();
		int tot = sJ.total(75, 85, 85);
		System.out.println(tot);
		double result = sJ.avg();
		System.out.println(result);

	}
}
