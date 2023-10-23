package com.step4;
class D{
	int tot;
	int avg;
	void hap(int n1, int n2, int n3) {
		tot = n1 + n2 + n3;
	}
}
public class Dmain {
	public static void main(String[] args) {
		int n1 = 70;
		int n2 = 80;
		int n3 = 90;
		D d = new D();	
		d.hap(n1, n2, n3);
		System.out.println(d.tot);
	}
}
