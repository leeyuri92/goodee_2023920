package achat.step1;
// 서버가 한 말을 듣는 클래스 설계


// 메인메소드는 필요없어요 
// 화면쪽에서 처리할거니깐요
import java.util.StringTokenizer;
import java.util.Vector;

//서버가 한 말을 듣는 클래스 설계임
public class ChatClientThread extends Thread {
	ChatClient cc = null;
	public ChatClientThread(ChatClient cc) {
		//아래 초기화를 생략하면 ChatClientThread클래스안에서 ChatClient
		//의 변수나 메소드를 호출할 때 NullPointerException발동
		this.cc = cc;
	}
	//서버에서 말한 내용을 들어봅시다.
	public void run() {
		boolean isStop = false;
		start:
		while(!isStop) {
			try {
				String msg = "";
				msg = (String)cc.ois.readObject();
				StringTokenizer st = null;
				int protocol = 0;//100|200|500(나가기)
				if(msg !=null) {
					st = new StringTokenizer(msg,"|");
					protocol = Integer.parseInt(st.nextToken());//100
				}
				switch(protocol) {
					case 100: {// 100|kiwi - 입장하기 처리
						String nickName = st.nextToken();//kiwi
						cc.jta_display.append(nickName+"님이 입장하였습니다.\n");
						Vector<String> v = new Vector<>();
						v.add(nickName);
						cc.dtm.addRow(v);
					}break;
					case 200:{//다자간 대화 처리
						
					}break;
					case 500:{//나가기 처리
						
					}break start;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}