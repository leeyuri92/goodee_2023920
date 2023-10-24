package collec.list;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		Powder p = new Powder();
		ThreeDPrinter3 tp3 = new ThreeDPrinter3();
		tp3.setMaterial(p);  // 이슈가 발생하지 않는건 Object이기 때문이다.
		Powder p1 = (Powder)tp3.getMaterial();  // 타입을 잘못 맞추면 ClassCastingException이 발동될 수 있다. - 멈춘다

	} 

}
