package com.week1;
// 메소드의 파라미터로 참조형을 사용하는 방법
class Sonata{
	int speed = 0; 
	String carColor = "빨강";
}
public class WReturn3 {	
	Sonata getCar() {     //// 메소드의 리턴타입으로 참조형 변수를 사용할 수 있다.
		Sonata himCar = new Sonata();
		return himCar;
	}
	public static void main(String[] args) {
		Sonata myCar = new Sonata();
		System.out.println(myCar.carColor);
		
		WReturn3 w3 = new WReturn3();
		Sonata himCar = w3.getCar();
		
		System.out.println(myCar);  // 주소값 출력
		System.out.println(himCar);  // 주소값 출력		
		
		himCar.carColor = "검정색";
		System.out.println(himCar.carColor);
		System.out.println(himCar);  // 주소값 출력		
		;
	}
}
