package com.step3;
class Account1 {
	int sum;
	public void hap(int n) {
		int sum = 0;	
		for(int i = 1 ; i <=n ; i = i+2) {
			sum = sum + i;			
		}
		System.out.println(sum);
		this.sum = sum;
	}	
}
public class For3 {
	public static void main(String[] args) {
		Account1 ac = new Account1();
		ac.hap(5);    // 9
		ac.hap(10);	 // 25	
		System.out.println(ac.sum);
	}
}
 