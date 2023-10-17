package com.step2;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		//왜냐면 java.lang폴더에 없는 클래스 이니까
		//import해야 함
		//for(초기화;조건식;증가연산자);
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i=i+1) {
			System.out.println("요기 ===> "+ i);//0 1 2 3
			System.out.println(i+"번째 학생의 점수를 입력 받아서 출력해 볼까");
			int jumsu = sc.nextInt();
			System.out.println("입력받은 점수는 "+ jumsu + "입니다.");
		}//end of for
	}//end of main
}
