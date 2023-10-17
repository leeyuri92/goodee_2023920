package com.step3;

import java.util.Iterator;
import java.util.Scanner;

public class Scan1 {

	public static void main(String[] args) {
		System.out.println("메뉴를 선택하세요. [새게임 :1, 정답확인 : 2, 종료 : 3]");
		Scanner sc = new Scanner(System.in);
		int menu = 0;  	// 사용자가 선택한 메뉴 번호를 담을 변수 선언
		for(int i = 0 ; i < 3 ; i = i + 1) {
			//System.out.println(i);
			menu = sc.nextInt();
			if(menu==1) {
				System.out.println("새게임을 선택하셨습니다.");				
			} 
			else if (menu == 2) {
				System.out.println("정답보기를 선택하셨습니다.");				
			}
			else if (menu == 3) {				
				System.out.println("종료를 선택하셨습니다.");
			} 						
		} System.out.println("for문 탈출");
	}
}
/* 
사용자와 개발자 사이의 소통하기
이것은 화면 구현을 통해서 가능하다
우리는 아직 html 공부하지않고 있어서 콘솔창을 활용한 소통하기 시도
화면에서 입력받아야 하는 값들이 파라미터 자리를 채워야 한다.
사용자가(업무 담당자가) 입력한 값을 받아오기
*/
