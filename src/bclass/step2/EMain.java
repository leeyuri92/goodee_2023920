package bclass.step2;
class E{
	E(){
		System.out.println("E()");
	}
	void m() {
		
	}
}
public class EMain extends E {
	EMain() {
		System.out.println("E()");
	}
	@Override
	void m() {
		
	}
	public static void main(String[] args) {

	}

}
