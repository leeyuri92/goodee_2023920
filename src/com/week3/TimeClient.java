package com.week3;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JLabel;

public class TimeClient extends Thread {
	JLabel jlbTime = null;
	TimeView tView = null;
	public TimeClient() {}
//	public TimeClient(JLabel jlbTime) {
//		this.jlbTime = jlbTime;
//	}
	public TimeClient(TimeView tView) {
		this.tView = tView;
	}
	//콜백메소드 - actionPerformed - 개발자가 직접 호출하지 못한다.
	@Override
	public void run() {
		System.out.println("run호출");
		Socket socket = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try {
		String timeStr = null;
			socket = new Socket("localhost",5000);//ServerSocket 클라이언트의 소켓정보 쥔다
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			while(true) {
				//TimeServer에서 1초마다 getTime() 호출로 알아낸 시간 정보를 oos.writeObject(getTime())하면
				//아래에서 들을 수 있다.
				timeStr = ois.readObject().toString();
				System.out.println(timeStr);
				//아래코드는 TimeView에서 생성한 JLabel콤포넌트에 직접 출력하는문장
				//NullPointerException이 발생하지 않도록 맞는 생성자를 호출하기
				System.out.println("TimeClient : "+jlbTime);
				tView.jlbTime.setText(timeStr);//이 부분이 학습목표임
				tView.jf.setTitle(timeStr);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e.toString());
				}
			}////////end of while ////////////
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			try {
				ois.close();
				oos.close();
				socket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}///////////////end of run /////////////////

	public static void main(String[] args) {
		TimeClient tc = new TimeClient();
		tc.start();
	}

}