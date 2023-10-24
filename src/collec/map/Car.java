package collec.map;
// 추상클래스는 일반메소드로 선언하고 추상메소드도 선언 가능함
// 인터페이스가 추상클래스보다 더 추상적이다. - 왜냐면 일반메소드는 못 가진다.
public abstract class Car {
	int speed;
	String carName;
	String carColor;
	Car(){}
	public abstract void display();
	public void go() {
		speed = speed +1;
	}
	public void stop() {
		speed = speed -1;
	}

}
