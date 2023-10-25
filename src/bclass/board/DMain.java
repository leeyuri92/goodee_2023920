package bclass.board;

class D1{
	int methodA(int i, int j) {
		System.out.println(i + ", "+j);	
		return i+j;
	}
	
}



public class DMain {

	public static void main(String[] args) {
		D1 d1 = new D1();
		int i = 1;
		int j = 2;
		int hap = d1.methodA(i, j);
		System.out.println(hap);

	}

}
