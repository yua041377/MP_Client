package kr.or.ddit.widu.vo.board;

import java.io.Serializable;

public class Comment_tbVO implements Serializable {
	
	private int comment_id;
	private int board_id;
	private String comment_writer;
	private String comment_content;
	private String comment_date;
	
	public Comment_tbVO() {}
	
	@Override
	public String toString() {
		return "Comment_tbVO [comment_id=" + comment_id + ", board_id=" + board_id + ", comment_writer="
				+ comment_writer + ", comment_content=" + comment_content + ", comment_date=" + comment_date + "]";
	}
	public Comment_tbVO(int comment_id, int board_id, String comment_writer, String comment_content,
			String comment_date) {
		super();
		this.comment_id = comment_id;
		this.board_id = board_id;
		this.comment_writer = comment_writer;
		this.comment_content = comment_content;
		this.comment_date = comment_date;
	}
	public int getComment_id() {
		return comment_id;
	}
	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}
	public int getBoard_id() {
		return board_id;
	}
	public void setBoard_id(int board_id) {
		this.board_id = board_id;
	}
	public String getComment_writer() {
		return comment_writer;
	}
	public void setComment_writer(String comment_writer) {
		this.comment_writer = comment_writer;
	}
	public String getComment_content() {
		return comment_content;
	}
	public void setComment_content(String comment_content) {
		this.comment_content = comment_content;
	}
	public String getComment_date() {
		return comment_date;
	}
	public void setComment_date(String comment_date) {
		this.comment_date = comment_date;
	}
	
	
	
}
