package com.step3;
// 1부터 10까지의 합을 구하는 프로그램을 작성하시오
// 변수는 몇개가 필요한가
// 지변? 전변? 
public class For {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1 ; i <=10 ; i = i+1) {
			sum = sum + i;			
		}
		System.out.println(sum);
	}
}
