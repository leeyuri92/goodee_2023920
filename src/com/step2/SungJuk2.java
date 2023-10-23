package com.step2;

public class SungJuk2 {
	
	public int total(int n1, int n2, int n3) {
		int tot =  n1+n2+n3;
		return tot;		
	}
	public double avg(int tot) {
		int result = total(75, 85, 95);
		return result/3.0;		
	}
	public static void main(String[] args) {
		SungJuk2 sJ = new SungJuk2();
		int tot = sJ.total(75, 85, 95);
		double account = sJ.avg(tot);
		System.out.println(account);
	}
}
