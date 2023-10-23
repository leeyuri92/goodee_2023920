package com.step4;

public class Oper4 {

	public static void main(String[] args) {
		int i = 1;
		int j = 10;
		do { 
			System.out.println("if문 이전 - 나는 무조건 실행된다.");
		    if( i>j ) break;//1>10 false
		    System.out.println("if문 조건을 만족하면 나는 못 본다.");
		     j--;//9 8 7 6 5
		     //2<5, 3<5, 4<5, 5<5
		}while( ++i < 5 );//while문 조건에 j가 없다 - 중요하지 않다
		System.out.println("요기");
		//실행후 i , j의 값은? 
		System.out.println(i+", "+j);
	}
}
