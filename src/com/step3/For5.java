package com.step3;

public class For5 {

	public static void main(String[] args) {
		int sum =0 ;
		int i;
		for( i = 1; i <= 10 ; i = i + 1){
			if(i%3==0) {
				sum= sum+i;				
			}
		}
		System.out.println(sum);
	}
}
