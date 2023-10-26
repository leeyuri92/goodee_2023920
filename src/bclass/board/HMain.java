package bclass.board;
class H{	
	int i;	
	private static H h = new H();  // 이른 인스턴스화
	private H() {
		System.out.println("H()");
	}
	static H getInstance() {
		return h;
	}
}
public class HMain {
	public static void main(String[] args) {
		H h = H.getInstance();
		H h2 = H.getInstance();
		System.out.println(h +", "+ h2);
	}
}
