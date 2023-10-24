package achat.step1;

public class A {
	int i =1;
	void methodA() {
		System.out.println(this);
		System.out.println(this.i);
	}

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
		a.i = 2;
		a.methodA(); 
		System.out.println("main");
	}
}
