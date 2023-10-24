package achat.step1;

import java.awt.Color;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

// 왜 스레드를 상속받는 건가요? 
// 화면을 처리하는 메인메소드와 통신채널 설정하는 코드를 분리하기 위해 
// 장점 - 화면처리와 네트워크처리를 분리함으로써 안전한 서비스를 제공할 수 있다.
public class ChatServer extends Thread {
    // 메인메소드도 스레드라 했자나여 - entry point자나요 - 시작점이다 - exe파일을 생성할 수 있다. - 경합이 벌어진다
	// 경합이 벌어지면 끼어든다.
	
	List<ChatServerThread> globalList = new Vector<>() ;  // 챗서버에 접속해 온 사용자에 대한 정보를 담는 벡터선언, Vector는 멀티스레드일때 좋음 
	ServerSocket server = null;
	Socket socket = null;
	// 서버는 들은 내용을 말하는 것이다.
	// 실제로 듣고 말하는기는 ChatServerThread에서 처리하도록 설계했다.
	// run메소드에서 서버소켓에 접속해온 클라이언트측의 소켓정보를 받게되니까 메소드 내부에서 사용하려면 전변으로 한다.
	
	JFrame jf = new JFrame();
	JTextArea jta_log = new JTextArea(10,60);
	JScrollPane jsp_log = new JScrollPane(jta_log
			, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
			, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER );
	
	
	// 생성자
	public ChatServer() {}	
	
	// 메소드	
	@Override
	public void run() {  // 통신에 대한 처리 - 지연, 끊김, 노이즈, 대기
		// 클라이언트 접속을 해옴	
		//서버에 접속해온 클라이언트 스레드 정보를 관리할 벡터 생성하기 
				globalList = new Vector<>();  // ChatServerThread담기 - 동시에 3명이 들어온다면
				boolean isStop = false;
				try {  // 만일 3002번 포트를 오라클 서버에서 점유하고 있다면 예외가 발생할 것이다.
					server = new ServerSocket(3002);
					jta_log.append("Server Ready.........\n"); // 대기중 -  손이 오길 기다린다 - 다음코드가 실행기회를 못갖는다. (흐름방해코드=장애처리)
					while(!isStop) {
						// 서버소켓에 접속해온 사용자의 소켓정보를 담는다.
						// Socket s = new Socket("172.16.2.11", 3002); - ChatClient - 입장하기
						socket = server.accept(); // 클라이언트정보 받아오는 지점
						jta_log.append("client info:"+socket+"\n");		// 여기 소켓은 클라이언트소켓을 쥐고있다.
						
						// this는 chatServer가리킨다
						ChatServerThread tst = new ChatServerThread(this); 
						// this = ChatServer 서버에 접속한 소켓정보를 ChatServerThread에서 사용해야 하니까 this로 넘긴다.
						// 서버정보를 서버스레드에 정보를 넘겨줌
						tst.start();  // ChatServerThread의 run이 호출된다.
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
	}
	
	public void initDisplay() {
		jta_log.setLineWrap(true);  // 창이 늘어나지않게 텍스트가 다음줄로 넘어가는 소스
		jf.setBackground(Color.orange);
		jf.add("Center",jsp_log);
		jf.setTitle("서버측 로그 출력화면");
		jf.setSize(800, 600);
		jf.setVisible(true);		
	}
	
	// 메인메소드
	public static void main(String[] args) {
		ChatServer cs = new ChatServer();
		
		// 두 메소드가 호출되었을 때 지연이 발생되는 메소드는 start()이다.
		// 같은 메소드라도 처리되는 시간이 다르다. - 스케줄링이 필요함
		// 스레드 - this.sleep(1000), this.wait(), this.notify() 와 비슷하다(대기상태에 있다) 
		cs.initDisplay();
		cs.start();  // 여기서 대기탄다 - this.wait(); -> this.notify(); 잠자는 스레드를 깨운다
		

	}

}
