package bclass.board;

public class CarTest {

	public static void main(String[] args) {
		Car yourCar = CarFactory.getInstance();
		Car himCar = CarFactory.getInstance();	

		System.out.println(yourCar.getCarNum());         //  1001
		System.out.println(himCar.getCarNum());          //  1002
	}
}
