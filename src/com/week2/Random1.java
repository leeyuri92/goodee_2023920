package com.week2;

import java.util.Random;

// 사용자클래스와 자바제공클래스 - 2개를 가지고 연습하기
// 사용자클래스와 사용자클래스 - 2개를 선언해서 훈련하기
// 인스턴스화 - 클래스와 클래스 관계
// 업무 분담 > 나신입, 나초보 > 형상관리(버전관리) > Git도구활용
// 단위테스트(테스트시나리오) > 통합테스트
// 업무와 업무 사이의 관계 확인

public class Random1 {

	public static void main(String[] args) {
		Random r = new Random(); // 내가 정의한 클래스가 아니다 (import해야함 - 자동생성)
		for(int i=0 ; i<10 ; i=i+1) {
			int s=r.nextInt(10); // 0.0 ~ 10.0
			System.out.println(s);			
		}
	}
}
