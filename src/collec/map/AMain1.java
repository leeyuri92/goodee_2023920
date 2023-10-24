package collec.map;
class A1{
	A2 keySet() {
		return new A2();
	}
}
class A2{
	Object[] toArray() {
		return new Object[3];
	}
}

public class AMain1 {

	public static void main(String[] args) {
		A1 a1 = new A1();
		Object objs[] = a1.keySet().toArray();
		System.out.println(objs.length);
		for(Object obj:objs) {
			System.out.println(obj);
		}

	}

}
