package com.step3;
public class Break1 {
	public static void main(String[] args) {
		for(int i =2; 1<10 ; i=i+1 ) {
			if (i==6) break;
				// if문에 return을 만나면 메소드를 탈출하고
				// if문이 반복문 안에 있을 땐 break; 사용할 수 있다. - for문을 탈출함			
		}
	}
}
