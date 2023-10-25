package bclass.board;

public class Car {
	private int carNum;
	// 디폴트 생성자 -  리턴타입이 없고, 구현없음. 생략가능
	public Car() {
		CarFactory.serialNum++;
		carNum = CarFactory.serialNum;		
	}
	public int getCarNum() {
		return carNum;
	}
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
}
