package collec.basic;

import java.util.ArrayList;
import java.util.List;

class B{
	List<Integer> nums = new ArrayList<>();
	int ival;
	String s = null;
	String s1 = new String();
	
	B(){
	}
	B(int ival){
		s = new String("나초보");
	}
}
public class BMain {
	public static void main(String[] args) {
		System.out.println("main 호출");  
		B b = new B();
		try {
			System.out.println(b.s.length());			
		} catch (Exception e) {
			System.out.println("NullPointerException발동 - 왜냐면 11번 디폴트 생성자에서는 s에 대한 인스턴스화가 안됨");
		}
		b = new B(1);
		System.out.println(b.s.length());
	}
}
