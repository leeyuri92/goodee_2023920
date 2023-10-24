package jdbc.oracle;

public class BookVO {
     private int b_no             =  0  ;
     private String b_title       =  ""  ;
     private String b_author   =  null  ;
     private int  b_price         =  0  ;
     
     
     // 테이블에 들어있지 않는 값 -  경험으로 인해 선언할 수 있음
     // int count = 5;  // 도서주문량
     

	public int getB_no() {
		return b_no;
	}

	public void setB_no(int b_no) {
		this.b_no = b_no;
	}

	public String getB_title() {
		return b_title;
	}

	public void setB_title(String b_title) {
		this.b_title = b_title;
	}

	public String getB_author() {
		return b_author;
	}

	public void setB_author(String b_author) {
		this.b_author = b_author;
	}

	public int getB_price() {
		return b_price;
	}

	public void setB_price(int b_price) {
		this.b_price = b_price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
