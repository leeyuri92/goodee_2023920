package bclass.step2;

import javax.swing.JFrame;

public class DMain extends JFrame{
	//JFrame jf = new DMain();
	DMain(){
	}
	public void initDisplay() {
		jf.setSize(600,500);
		jf.setVisible(true);		
	}
	public static void main(String[] args) {
		DMain dm = new DMain();
		dm.initDisplay();
	}

}
