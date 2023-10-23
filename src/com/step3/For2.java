package com.step3;
// 1부터 10까지 홀수의 합을 구하시오
public class For2 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1 ; i <=10 ; i = i+2) {
			sum = sum + i;			
		}
		System.out.println(sum);
	}
}
