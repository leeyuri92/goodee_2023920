package bclass.board;

public class CarFactory {
	public static int serialNum = 1000;
	public static Car getInstance() {
		Car myCar = null;
		if(myCar==null) {  // myCar변수를 null체크하여 null인 경우에만 인스턴스화 함 - 싱글톤
			myCar = new Car();
		}
		return myCar;
	}
}
