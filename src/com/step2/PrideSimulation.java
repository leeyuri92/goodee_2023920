package com.step2;
class Pride{
	private int speed;
	private String carColor;
	private int wheelNum;
	// getter메소드는 전역변수에 담긴 값을 꺼낼때 사용하자
	public int getSpeed() {
		return speed;
	}
	// setter메소드는 전역변수가 private이라서 직접 접근이 불가하니까
	// 메소드의 파라미터 자리를 활용하여 결정된(사용자나 업무담당자) 값을 전변에 초기화
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public int getWheelNum() {
		return wheelNum;
	}
	public void setWheelNum(int wheelNum) {
		this.wheelNum = wheelNum;
	}	
}
public class PrideSimulation {

	public static void main(String[] args) {
		Pride myCar = new Pride(); //30km
		myCar.setSpeed(30);
		Pride yourCar = new Pride(); //50km
		yourCar.setSpeed(50);
		Pride himCar = new Pride(); //100km
		himCar.setSpeed(100);
		System.out.println(myCar.getSpeed());
		System.out.println(yourCar.getSpeed());
		System.out.println(himCar.getSpeed());
	}
}
