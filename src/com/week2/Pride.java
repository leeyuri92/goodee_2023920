package com.week2;

public class Pride {
	int speed = 0;
	public Pride() { // 생성자 - 파라미터가 없는 생성자는 JVM이 대신 주입해줌 - 그래서 나는 안함
		System.out.println("Pride()디폴트 생성자 호출 성공");	
		speed = 10;
	}
	public static void main(String[] args) {		
		Pride myCar = null;   // 선언만 하면 주소번지가 할당되지 않음
		myCar = new Pride();  // "Pride()디폴트 생성자 호출 성공"
		System.out.println(myCar.toString());  // com.week2.Pride@2f4d3709
		
		myCar.speed = 20;
		// speed = 30;  static영역 안에서 non-static타입의 변수는 접근이 불가하다.
		// 만일 가능하게 하려면 인스턴스변수.speed로 호출할 수 있다
		
		System.out.println(myCar.speed); 
	}
}
