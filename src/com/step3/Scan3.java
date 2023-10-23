package com.step3;

import java.util.Scanner;

//메뉴 선택하기
public class Scan3 {

	public static void main(String[] args) {
		System.out.println("메뉴를 선택하세요.[새게임: Y, 정답확인:2, 종료:N]");
		Scanner sc = new Scanner(System.in);
		//사용자가 선택한 메뉴 번호를 담을 변수 선언
		String menu = null;
		int i=0;
		//for(변수선언및초기화;조건식-true or false;증감연산자);
		for(i=0; i<3 ; i=i+1) {
			System.out.println(i);//0 - 1 - 2
			//당신의 선택은?
			menu =  sc.next();
			if(!"Y".equals(menu) || !"N".equals(menu)) {
				System.out.println("Y나 N만 받아줄거야");
				continue;
			}
			else {
				System.out.println(menu);
				if("Y".equals(menu)) {
					
				}
				else if("N".equals(menu)) {
					
				}
			}
		}//////////end of for
		System.out.println("for문 탈출 - 여기로.....");
	}////////////end of main
}///////////////end of Scan1
/*
	사용자와 개발자 사이의 소통하기
	이것은 화면 구현을 통해서 가능하다.
	우리는 아직 html 공부하지 않고 있어서 콘솔창을 활용한 소통하기 시도
	화면에서 입력받아야 하는 값들이 파라미터 자리를 채워야 한다.
	사용자가(업무담당자가) 입력한 값을 받아오기
	
*/