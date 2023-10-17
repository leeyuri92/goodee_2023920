package com.step3;

public class FizzBuzz {

	public static void main(String[] args) {
		int i;
		for( i=1 ; i < 101 ; i = i + 1) {
			if(i%5==0 & i%7==0) {
				System.out.println("FizzBuzz");
			}
			else if(i%5==0) {
				System.out.println("Fizz");
			}
			else if (i%7==0) {
				System.out.println("Buzz");				
			} 
			else{
				System.out.println(i);	
			}					
		}
	}
}
