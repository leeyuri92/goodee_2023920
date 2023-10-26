package aquiz.step1;

public class Pass {
	int x = 5; // main 에서 선언된 지역변수
	public static void main(String[] args) {
		Pass p = new Pass();
		p.doStuff(p.x);
		System.out.println(" main x = " + p.x);
	}
	void doStuff(int x) {
		System.out.println(" doStuff x = " + x++); // x 를 증가시키기전에 출력한다.
		System.out.println(" doStuff x = " + (this.x)++); // x 를 증가시키기전에 출력한다.
	}
}

//A. Compilation fails.
//B. An exception is thrown at runtime.
//C. doStuffx = 6 main x = 6
//D. doStuffx = 5 main x = 5
//E. doStuffx = 5 main x = 6
//F. doStuffx = 6 main x = 5
//Question 12 : 변수의 적용범위