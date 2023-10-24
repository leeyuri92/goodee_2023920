package achat.step1;

import java.util.StringTokenizer;

public class ProtocolTest {

	public static void main(String[] args) {
		String msg = "200|kiwi|tomato|오늘 스터디 할래?";
		StringTokenizer st = new StringTokenizer(msg, "|");  // token
		String protocol = st.nextToken();
		String from = st.nextToken();
		String to = st.nextToken();
		String msg1 = st.nextToken();	
		System.out.println(protocol+", "+from +", "+to +", "+ msg1);
		
		while(st.hasMoreElements()) {
			st.nextToken();
			String s = st.nextToken();
			System.out.println(s);			
		}
	}
}