package jdbc.oracle;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

// ActionListener al = new EmpManager();   뭐에대한 버튼인지 결정되지 않아서 추상적
// List list = new Vector();
// List list = new ArrayList();
public class EmpManager extends JFrame implements ActionListener{
	
	JPanel jp_north        = new JPanel();  // 버튼을 붙이기 위한 속지 
	JButton jbtn_select    = new JButton("조회");
	JButton jbtn_insert    = new JButton("입력");
	JButton jbtn_update  = new JButton("수정");
	JButton jbtn_delete   = new JButton("삭제");
	
	
	
	
	
	String data[][] = new String[0][3];
	String header[] = {"사원번호","사원명","급여"};
	
	// DataSet , 화면이 아니다
	DefaultTableModel dtm = new DefaultTableModel(data,header); // web개발 > json역할 > 실제 데이터를 쥐고있다
	JTable jt = new JTable(dtm);// 양식 - 폼 - 그림 - 표
	JScrollPane jsp = new JScrollPane(jt);
	
	public EmpManager() {
		init();
	}
	public void init() {
		data = new String[][] {
			{"7566", "나신입","3000"}
			,{"7499", "나초보","4000"}
			,{"7748", "나일등","4500"}
		};				
	}	 
	public void initDisplay() {
		
		jbtn_update.addActionListener(this);   // this =  EmpManager
		
		jp_north.setLayout(new GridLayout(1,4)); // 그리드레이아웃으로 1개를 4등분으로 
		// FlowLayout은 왼쪽부터 오른족으로 배치, 공간도 남음 
		
		jp_north.add(jbtn_select); // 속지에 버튼 붙이기
		jp_north.add(jbtn_insert);
		jp_north.add(jbtn_update);
		jp_north.add(jbtn_delete);		
		
		System.out.println(data[0][1]);    //  나신입
		System.out.println(data[0]);       //  [Ljava.lang.String;@2344fc66
		System.out.println(data[1]);       //  [Ljava.lang.String;@458ad742
		
		Container con = this.getContentPane();
		dtm = null;
		dtm = new DefaultTableModel(data,header);
		jt = null;
		jt = new JTable(dtm);
		jsp = null;
		jsp=new JScrollPane(jt);
		
		this.add("North",jp_north);
		this.add("Center", jsp);	
				
		this.setSize(500, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		EmpManager em = new EmpManager();
		em.initDisplay();	

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		if(obj == jbtn_update) {
			System.out.println("수정버튼 누른거니????");
			for(int i = 0;i<dtm.getRowCount();i++) {
				if(jt.isRowSelected(i)) {					
					// 나초보랑 같은 로우값이면
					// 나초보를 가져오는 낱말카드 
					String cname = (String)dtm.getValueAt(i,1);// 가져온 값이랑 비교
					System.out.println(" 사용자가 선택한 로우의 이름 ====> " + cname);
					if("나초보".equals(cname)) {
						dtm.setValueAt(5000, i, 2);						
					}
					else if("나신입".equals(cname)) {
						dtm.setValueAt(3500, i, 2);										
					}
					else if("나일등".equals(cname)) {
						dtm.setValueAt(5500, i, 2);
					}
				}
			}
		}		
	}
}
