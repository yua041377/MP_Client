package kr.or.ddit.widu.vo.board;

import java.io.Serializable;

public class BoardVO implements Serializable{
	
	private int board_id;
	private String board_writer;
	private String board_title;
	private String board_content;
	private String board_date;
	private int category_id;
	
	public BoardVO() {}
	
	public BoardVO(int board_id, String board_writer, String board_title, String board_content, String board_date,
			int category_id) {
		super();
		this.board_id = board_id;
		this.board_writer = board_writer;
		this.board_title = board_title;
		this.board_content = board_content;
		this.board_date = board_date;
		this.category_id = category_id;
	}
	
	@Override
	public String toString() {
		return "BoardVO [board_id=" + board_id + ", board_writer=" + board_writer + ", board_title=" + board_title
				+ ", board_content=" + board_content + ", board_date=" + board_date + ", category_id=" + category_id
				+ "]";
	}

	public int getBoard_id() {
		return board_id;
	}
	public void setBoard_id(int board_id) {
		this.board_id = board_id;
	}
	public String getBoard_writer() {
		return board_writer;
	}
	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public String getBoard_date() {
		return board_date;
	}
	public void setBoard_date(String board_date) {
		this.board_date = board_date;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	
	
}
