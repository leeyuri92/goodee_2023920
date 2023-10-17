package com.step3;

public class C {

	public static void main(String[] args) {
		for(int i=1;i<101;i=i+1) {
			if(i%5==0 & i%7==0) {
				System.out.println("fizzbuzz");//35 70
			}
			//insert here 괜찮아
			else if(i%5==0) {
				System.out.println("fizz");
			}
			else if(i%7==0) {
				System.out.println("buzz");
			}
			//insert here 여기도 괜찮아
			//5의 배수도 아니고 7의 배수도 아니고 또35의 배수도 아닐때만 출력한다.
			else {
				System.out.println(i);				
			}
		}

	}

}
