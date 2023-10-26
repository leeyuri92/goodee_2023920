package aquiz.step1;
// throws, throw
public class Q27_1 {
	// 클래스에 대한 제어권이 개발자인 나에게 없다 - spring 컨테이너가 대신 주입해준다.
	static void m() throws Exception{  // 예외처리를 나를 호출한 곳에서 하시오. (예외처리 미루기)
		System.out.println(5/0);
	}
	public static void main(String[] args) {
		try {
			Q27_1.m();   // static 붙은 메소드는 인스턴스화 없이 호출이 가능하다.		
		} catch (Exception e) {
		}
	}
}
