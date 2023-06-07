package kh.lcalss.vo;

public class TestVo {
	private int voardNum;
	private String boardWriter;
	private String boardTitle;
	private String boardContent;
	private String boardDate;
	//쌩성자
	public TestVo() {}
	//all arguments
	public TestVo(int voardNum, String boardWriter, String boardTitle, String boardContent, String boardDate) {}
	//getter, setter
	public int voardNumGetter() {
		return this.voardNum;
	}
	public void voardNumSetter(int voardNum) {
		this.voardNum = voardNum;
	}
	public String boardWriterGetter() {
	return this.boardWriter;
	}
	public void boardWriterSetter(String boardWriter ) {
		this.boardWriter = boardWriter;
	}
	public String boardTitleGetter() {
		return this.boardTitle;
	}
	public void boardTitleSetter(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String boardContentGetter() {
		return this.boardContent;
	}
	public void boardContentSetter(String boardContent) {
		this.boardContent = boardContent;
	}
	public String boardDateGetter() {
		return this.boardDate;
	}
	public void boardDateSetter(String boardDate) {
		this.boardDate = boardDate;
	}
	
	//toString
	public String toString (int voardNum, String boardWriter, String boardTitle, String boardContent, String boardDate) {
		String str = null;
		return str;
	}
	
}
