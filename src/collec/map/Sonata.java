package collec.map;

public class Sonata extends Car {

	@Override
	public void display() {

	}
	public void other() {
		System.out.println("Sonata에 대한 other메소드 호출");
	}
	public void stop() {
		System.out.println("Sonata stop 호출");
		speed = speed -2;
	}
	public static void main(String[] args) {
		// myCar타입의 변수로 Sonata클래스에 정의된 메소드를 호출 할 수 없다.
		Car myCar = new Sonata();
		// myCar는 Car클래스 타입이라서 Car에도 있고 Sonata에도 있는 메소드만 호출 가능
		// 양쪽에 다 있다면 누가 호출될까 - 부모가 쥔 메소드는 쉐도우 메소드가 된다 - 호출이 불가
		// 결론- 메소드를 찾을때는 젤 하위메소드를 찾아서 쓰자 
		// 메소드 오버라이딩
		myCar.stop();
		Sonata himCar = new Sonata();
		himCar.other();
		// 누가 더 많은 변수와 메소드를 누릴 수 있나요? - Sonata
	}

}
