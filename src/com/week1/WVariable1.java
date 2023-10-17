package com.week1;


class Dog{
	// 클래스 선언 바로 뒤에 붙여서 선언, 이클립스에서는 파란색으로 표시됨
	int leg = 4;
	public void running() {
		int leg = 6; // 요기는 지변위치이다. 색상이 다르다. 파랑이 아니다
		System.out.println(leg);	
	}
}

public class WVariable1 {
	// 16 - 17(인스턴스화 : 메모리에 로딩중임) - 6 - 19(4출력됨 - 전변이 호출)
    // 21(상수 6이 출력됨 - 변수를 사용한건 아니잖아요)
	public static void main(String[] args) {
		Dog myDog = new Dog();
		//System.out.println("6을 출력할 수 있다?없다? " + d.leg); // 4  -> 전변출력
		System.out.println(myDog.leg);
		//
		System.out.println(6);
		// 6 을 호출하기 위해서는
		// running메소드는 어느 클래스에 선언되어있는지
		// 그 클래스가 인스턴스화가 되어있는지
		myDog.running();
		// running 안에 print문이 있어야 6을 출력할 수 있다. 방법은 이것뿐
	}
}
