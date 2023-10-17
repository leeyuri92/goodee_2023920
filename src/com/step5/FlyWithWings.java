package com.step5;
//동일한 메소드를 호출했다고 하더라도 구현체 클래스에 따라서
//어쩔땐 날고 또 어떤 클래스일 땐 날지 못한다 - 다형성, 폴리모피즘
//전제조건=> 선언부의 타입과 생성부의 타입이 무조건 다를때
//List list = new ArrayList();
//list = new Vector();
//list = new LinkedList();
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("나는 날고 있어요^^");
	}

}
