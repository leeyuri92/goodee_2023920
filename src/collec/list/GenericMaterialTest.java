package collec.list;

public class GenericMaterialTest {

	public static void main(String[] args) {
		Powder p = new Powder();
		GenericMaterial<Powder> tp3 = new GenericMaterial<>();
		tp3.setMeterial(p);  // 이슈가 발생하지 않는건 Object이기 때문이다.
		Powder p1 = tp3.getMeterial();  // 타입을 잘못 맞추면 ClassCastingException이 발동될 수 있다. - 멈춘다
        System.out.println();
	

	}

}
