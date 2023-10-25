package bclass.board;

public class BoardVO {
	// 1이면 입력|수정|삭제 성공, 0이면 입력|수정|삭제 
	 private int      fb_no         = 0 ;      // 글번호
	 private String  fb_title       = "" ;     // 글제목 
	 private String  fb_writer     = "" ;     // 작성자
	 private String  fb_content  = "" ;     // 글내용
	 private int      fb_hit         = 0 ;      // 조회수
	 private int      fb_group    = 0 ;       // 글그룹번호
	 private int       fb_step      = 0 ;      // 글순번
	 private String  fb_date      = "" ;	  // 작성일자                 
	
	private int result = -1;  // 회손되거나 두 가지의 값을 가지지 않도록 -1로 설정

	public int getFb_no() {
		return fb_no;
	}

	public void setFb_no(int fb_no) {
		this.fb_no = fb_no;
	}

	public String getFb_title() {
		return fb_title;
	}

	public void setFb_title(String fb_title) {
		this.fb_title = fb_title;
	}

	public String getFb_writer() {
		return fb_writer;
	}

	public void setFb_writer(String fb_writer) {
		this.fb_writer = fb_writer;
	}

	public String getFb_content() {
		return fb_content;
	}

	public void setFb_content(String fb_content) {
		this.fb_content = fb_content;
	}

	public int getFb_hit() {
		return fb_hit;
	}

	public void setFb_hit(int fb_hit) {
		this.fb_hit = fb_hit;
	}

	public int getFb_group() {
		return fb_group;
	}

	public void setFb_group(int fb_group) {
		this.fb_group = fb_group;
	}

	public int getFb_step() {
		return fb_step;
	}

	public void setFb_step(int fb_step) {
		this.fb_step = fb_step;
	}

	public String getFb_date() {
		return fb_date;
	}

	public void setFb_date(String fb_date) {
		this.fb_date = fb_date;
	}

	public int getResult() {
		return result;
	}
	
	// 메소드일땐 그 값에 대한 유효성 체크가 가능하다
	public void setResult(int result) {   // 1 또는 0
		boolean isValid = false;
		// public으로 변수만 선언하여 직접 사용할 때 보다 메소드를 통해서 값을 사용하므로
		// 입력값에 대한 유효성 체크를 할 수 있다.
		if(result==0|result==1) {
			isValid = true;
		}
		else {
			isValid = false;
		}
		this.result = result;
	}

}
