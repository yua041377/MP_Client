package kr.or.ddit.widu.vo.question;

public class Question_BoardVO {
	
	private int question_id;
	private String mem_id;
	private String question_title;
	private String question_date;
	private String question_content;
	private String question_comment;
	
	public Question_BoardVO() {}
	
	public Question_BoardVO(int question_id, String mem_id, String question_title, String question_date,
			String question_content, String question_comment) {
		super();
		this.question_id = question_id;
		this.mem_id = mem_id;
		this.question_title = question_title;
		this.question_date = question_date;
		this.question_content = question_content;
		this.question_comment = question_comment;
	}
	@Override
	public String toString() {
		return "Question_BoardVO [question_id=" + question_id + ", mem_id=" + mem_id + ", question_title="
				+ question_title + ", question_date=" + question_date + ", question_content=" + question_content
				+ ", question_comment=" + question_comment + "]";
	}
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getQuestion_title() {
		return question_title;
	}
	public void setQuestion_title(String question_title) {
		this.question_title = question_title;
	}
	public String getQuestion_date() {
		return question_date;
	}
	public void setQuestion_date(String question_date) {
		this.question_date = question_date;
	}
	public String getQuestion_content() {
		return question_content;
	}
	public void setQuestion_content(String question_content) {
		this.question_content = question_content;
	}
	public String getQuestion_comment() {
		return question_comment;
	}
	public void setQuestion_comment(String question_comment) {
		this.question_comment = question_comment;
	}
	
	
	
}
