package com.week3;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

//메인스레드와 통신객체 사이에 경합이 벌어질 수 있어서 굳이 Thread를 상속받음.
public class TimeServer extends Thread {
	//생성자
	//아래 소켓은 서버소켓에 접속해온 클라이언트의 소켓정보를 쥐고 있다. 
	//TimeClient에서 호출될 때 결정되므로 일단 null!! 
	Socket client = null;
	 /*이 부분이 학습 필요한 부분 */
	public TimeServer(Socket client) { //getTime에서 나온 정보를 소켓을 통해 보냄. 
		this.client = client; 
	}
	public String getTime() {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		//10보다 작은 숫자는 앞에 0을 붙여서 표시 -> String으로 작업하기 위해서
		return (hour < 10 ? "0" + hour : "" + hour) + ":" +
		(min < 10 ? "0" + min : "" + min)  +	":" +
		(sec < 10 ? "0" + sec : "" + sec) ;
	}
	//오버라이드 - 콜백메소드-run 함수의 오버라이드
	@Override
	public void run() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream());
			while(true) {
				//서버소켓에 접속한 클라이언트 소켓을 가지고 OutputStream을 생성하면 writeObject메소드를 통해서
				//오브젝트단위로 메시지를 쓴다
				System.out.println("server run호출");
				oos.writeObject(getTime());
				try {
					sleep(1000); //1초
				} catch (Exception e) {
					// TODO: handle exception
				} 
			}
		} catch (Exception e) {
			try {
				client.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	/*
	서버측에서 CalendarAPI를 이용해 현재 시간 정보를 반환하는 메소드를 설계한다
	반환타입과 리턴타입 결정 -> 파라미터는 필요x(국제 표준시니까), 리턴타입은 string으로 해서 JLabel에 찍자
	Calendar(TimeZone zone, Locale aLocale)
	Constructs a calendar with the specified time zone and locale.
	field - static int
	*/ 
	public static void main(String[] args) {
		//선언과 생성 나누는 이유는 네트워크는 나눠서 처리해야함. 
		int port = 5000;
		ServerSocket server = null;
		Socket client = null;
		try {
			server = new ServerSocket(port);
		} catch (IOException e) {
			System.out.println("해당포트는 이미 사용중입니다.");
			try {
				server.close();				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}///////////////////// end of try
		//여기 까지 진행되었다면 포트도 점유했고 서버소켓도 정상적으로 만들어짐
		System.out.println("TimeServer started successfully...");
		while(true) {
			try {
				//클라이언트 소켓이 접속해 올 때 까진 기다리고 있음-wating 상태, 다음코드 진행x
				client = server.accept();
				//클라이언트가 들어오면
				if(client !=null) {
					//System.out.println(client); 
				}
				System.out.println("New client connected...");
				//생성자 호출, 전변으로 선언된 클라이언트가 76번에서 실체가 생김
				//생성자 안에 inputStream, OutputStream 생성함
				TimeServer ts = new TimeServer(client);
				ts.start();
				System.out.println("New TimeServer Thread started...");
			} catch (Exception e) {
				System.out.println("Can't start server thread!!!");
				e.printStackTrace();
				try {
					client.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}////////////////////// end of main 
	}//////////////////////// end of main //////////////////////


}//end of TimeServer