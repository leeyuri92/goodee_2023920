package com.step3;

import java.util.Random;
import java.util.Scanner;
/*
 아직 3자리의 숫자를 한번에 확인하고 수정하는걸 모르겠음.. 각자 자릿수의 숫자를 확인하는방법? 
*/
public class BaseBallGame {
	int dap1, dap2, dap3 = -1; // 랜덤 숫자 변수-	1차배열
	int num1 , num2, num3 = 0; //유저가 적는 숫자 1차배열
	int gameCount = 0; //게임 카운터
	int strike = 0; //스트라이크 갯수
	int ball = 0; //볼 갯수
	Scanner sc = new Scanner(System.in);
	
	void newNumber() {//랜덤 숫자 정하기
		Random r = new Random();
		while(true) {
			dap1 = r.nextInt(10);// 일의자리 숫자 채번
			dap2 = r.nextInt(10);// 십의자리 숫자 채번
			dap3 = r.nextInt(10);// 백의자리 숫자 채번
			if(!(dap1==dap2 || dap1==dap3 || dap3==dap1)) {				
				break;
			}
		}
		System.out.println("새로운 숫자는 "+ dap3 + dap2 + dap1 +" 입니다.");//실제 게임일땐 보이면 안됨
	}
	
	void inserNumber() { //사용자가 숫자 입력
		System.out.println("일의 자리 숫자를 입력해주세요");
		num1 = sc.nextInt();
		System.out.println("십의 자리 숫자를 입력해주세요");
		num2 = sc.nextInt();
		System.out.println("백의 자리 숫자를 입력해주세요");
		num3 = sc.nextInt();
	}
	
	void chackNum() {//숫자 체크하기
		if(dap1 == num1) strike = strike + 1;// strike 체크
		if(dap2 == num2) strike = strike + 1;
		if(dap3 == num3) strike = strike + 1;

		if(num1 == dap2 || num1 == dap3) ball = ball + 1;// ball 체크
		if(num2 == dap1 || num2 == dap3) ball = ball + 1;
		if(num3 == dap1 || num3 == dap2) ball = ball + 1;
		
	}
	
	public static void main(String[] args) {
		BaseBallGame bbg = new BaseBallGame();
		System.out.println("게임을 시작할까요? (Y/N)");
		if("Y".equals(bbg.sc.next())) {
			System.out.println("게임을 시작합니다. 기회는 총 10번입니다.");
			bbg.newNumber();
			while(true) {//무한 루프
				bbg.ball = 0;
				bbg.strike = 0;
				bbg.gameCount++; // 게임 카운트 증가 
				System.out.println("=========================="+bbg.gameCount+"번째 기회입니다.==========================");
				bbg.inserNumber();
				bbg.chackNum();
				if(bbg.strike == 3) {
					System.out.println(+ bbg.gameCount + "번째 기회에 세개의 숫자가 모두 맞았습니다");
					break;
				}else{
					System.out.println(bbg.strike + "스트라이크 " + bbg.ball + "볼 입니다.");
					if(bbg.gameCount == 10) {//기회는 10번으로 주어짐
						System.out.println("모든 기회를 소모하였습니다.");
						break;
					}
				}
			}
		}else {
			System.out.println("게임을 종료합니다.");
		}

	}

}