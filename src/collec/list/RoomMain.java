package collec.list;

public class RoomMain {
	Room r1 = null;
	Room r2 = null;
	
	public void room1() {
		r1 = new Room();
		r1.inwon = 7;
		r1.title = "스프링 스터디3기 모집";
		r1.names.add("나초보");
		r1.names.add("유재석");
		r1.names.add("강호동");		
	}
	public void room2() {
		r1 = new Room();
		r1.inwon = 20;
		r1.title = "보드타실분";
		r1.names.add("나신입");
		r1.names.add("나일등");
		r1.names.add("이성계");		
	}

	public static void main(String[] args) {
		// Spring에서는 개발자가 직접 인스턴스화 하지 않는다.
		// 필요할 때 Spring이 대신(주도권이 넘어갔다) 객체를 자동으로 주입해준다.
		// 객체가 생성되는 시점에 따라 문제가 발생할 수 있다. (객체라이프사이클 -> 탄생 - 활동 - 죽음(소멸-캔디데이트상태{가비지컬렉터 - 자원회수}))
		// 1. 이른 인스턴스화 - 미리, 먼저해준다(전변성격)  2. 게으른 인스턴스화(지변성격)
		// NullPointerException이 발생하지 않는다.
		// 왜냐면 Spring 컨테이너가 대신 해주니까
		// 또 라이프사이클도 직접 관리해준다.		
		RoomMain rm = new RoomMain();
		rm.room1();
		for(int i =0; i<rm.r1.names.size();i++) {
			System.out.println("=========================");
			System.out.println("최대인원수 :  " + rm.r1.inwon);
			System.out.println("방제목 :  " + rm.r1.title);
			System.out.println(rm.r1.names.get(i));
			System.out.println("=========================");
		}
	}
}
