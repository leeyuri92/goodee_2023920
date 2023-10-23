package com.step3;

import java.util.*;

public class BallGame1 {
	int[] random = new int[3]; 
	int[] user = new int[3];
	// 랜덤 3자리 구하는 메소드
	public void getRandom() {
		//int[] random = new int[3];//1부터 9까지의 임의의 숫자를 채번해서 초기화하기
		Random r = new Random();
		random[0] = r.nextInt(10)+1;
		do {
			random[1] = r.nextInt(10)+1;			
		}while(random[0]==random[1]);
		do {
			random[2] = r.nextInt(10)+1;			
		}while(random[2]==random[1] || random[2]==random[0]);
		System.out.println(random[0]+"+"+random[1]+"+" + random[2]);
	}
	
	// 유저한테 3자리 입력받는 메소드
	public int[] getNum() {
		//int[] user = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력하세요 : ");
		for(int i = 0; i < 3; i++) {
			user[i] = sc.nextInt();
		}
		return user;
	}
	
	// account
	public void account(String user) {
		int strikeCnt = 0;
		int ballCnt = 0;
		int temp = Integer.parseInt(user);//"123"-> 123
		int first = temp/100;//1
		System.out.println(" Strike : " + strikeCnt);
		System.out.println(" Ball : " + ballCnt);
		if(strikeCnt == 3) {
			System.out.println("정답입니다!.");
		} else if(strikeCnt !=3) {
			int[] user1 = getNum();
			playGame(user1);
		}
	
	}
	
	//랜덤숫자와 유저숫자 비교 메소드
	public void playGame(int[] user) {
		int strikeCnt=0;
		int ballCnt=0;
		for(int i = 0; i < 3; i++) {
			if(random[i] == user[i]) {
				strikeCnt++;
			}
			for(int j =0; j < 3; j++)
				if (random[i] != user[i] && random[i] == user[j]) {
					ballCnt++;
				}
		}
		account(user, strikeCnt, ballCnt);
	}

	public static void main(String[] args) {
		BallGame1 bg = new BallGame1();
		bg.getRandom();
		int[] user = bg.getNum();
		bg.playGame(user);
	}
}
