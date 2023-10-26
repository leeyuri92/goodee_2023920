package aquiz.step1;
// 접근제한자는 메소드 오버로딩에 영향이 없다.
// 리턴타입이 있고 없고는 영향이 있다.
public class MethodOver {
	public void setVar(int a, int b, float c) {}
	
	private void setVar(int a, float c, int b) {}
	//protected void setVar(int a, int b, float c) {}
	public int setVar(int a, float c, int b) { return a; }
	//public int setVar(int a, int b, float c) { return a; }
	//protected float setVar(int a, int b, float c) { return c; }

}