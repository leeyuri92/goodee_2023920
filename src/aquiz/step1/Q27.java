package aquiz.step1;

public class Q27 {
	public static void parse(String str) {
		float f =5.0f;   // 지변은 초기화를 생략할 수 없다.
		int y = 2;
		try {
			f = Float.parseFloat(str);
			int x = y/0;
			System.out.println(x);
		} catch (NumberFormatException nfe) {
			f = 0; 
		} catch (ArithmeticException ae) {
			System.out.println("ArithmeticException : " + ae.toString());
		} catch (Exception e) {
			System.out.println("Exception : " + e.toString());
		} finally {
			System.out.println(f);
		}
	}
	public static void main(String[] args) {
		Q27.parse("5");
	}
//		What is the result?
//		A. 0.0
//		B. Compilation fails.
//		C. A ParseException is thrown by the parse method at runtime.
//		D. A NumberFormatException is thrown by the parse method at runtime.
}
