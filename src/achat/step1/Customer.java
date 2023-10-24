package achat.step1;

import javax.swing.JFrame;

public class Customer extends JFrame implements Runnable { // 상속은 무조건 1개만 받을수 있다. 대신 인터페이스를 부를수 있다

	public static void main(String[] args) {
		Customer ct = new Customer();
		Thread th = new Thread(ct);
		th.start();  // run을 직접호출하는 것이 아니라 start 호출하면 시스템이 적당한 시기에 대신 호출함 -  콜백메소드
	}
	@Override
	public void run() {
		System.out.println("run 호출 성공");		
	}
}
