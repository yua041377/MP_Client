package kr.or.ddit.widu.vo.board;

import java.io.Serializable;

public class Board_categoryVO implements Serializable {
	
	private int category_id;
	private String category_name;
	
	public Board_categoryVO() {}
	
	@Override
	public String toString() {
		return "Boart_categoryVO [category_id=" + category_id + ", category_name=" + category_name + "]";
	}
	
	public Board_categoryVO(int category_id, String category_name) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	
	
	
	
	
}
