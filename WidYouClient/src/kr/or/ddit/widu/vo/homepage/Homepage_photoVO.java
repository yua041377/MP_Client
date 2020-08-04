package kr.or.ddit.widu.vo.homepage;

import java.io.Serializable;

public class Homepage_photoVO implements Serializable {
	
	private int homepage_photo_id;
	private int homepage_id;
	private String homepage_board_title;
	private String homepage_photo_content;
	private String homepage_photo_date;
	private String homepage_photo_name;
	
	public Homepage_photoVO() {}
	
	@Override
	public String toString() {
		return "Homepage_photoVO [homepage_photo_id=" + homepage_photo_id + ", homepage_id=" + homepage_id
				+ ", homepage_board_title=" + homepage_board_title + ", homepage_photo_content="
				+ homepage_photo_content + ", homepage_photo_date=" + homepage_photo_date + ", homepage_photo_name="
				+ homepage_photo_name + "]";
	}
	public Homepage_photoVO(int homepage_photo_id, int homepage_id, String homepage_board_title,
			String homepage_photo_content, String homepage_photo_date, String homepage_photo_name) {
		super();
		this.homepage_photo_id = homepage_photo_id;
		this.homepage_id = homepage_id;
		this.homepage_board_title = homepage_board_title;
		this.homepage_photo_content = homepage_photo_content;
		this.homepage_photo_date = homepage_photo_date;
		this.homepage_photo_name = homepage_photo_name;
	}
	public int getHomepage_photo_id() {
		return homepage_photo_id;
	}
	public void setHomepage_photo_id(int homepage_photo_id) {
		this.homepage_photo_id = homepage_photo_id;
	}
	public int getHomepage_id() {
		return homepage_id;
	}
	public void setHomepage_id(int homepage_id) {
		this.homepage_id = homepage_id;
	}
	public String getHomepage_board_title() {
		return homepage_board_title;
	}
	public void setHomepage_board_title(String homepage_board_title) {
		this.homepage_board_title = homepage_board_title;
	}
	public String getHomepage_photo_content() {
		return homepage_photo_content;
	}
	public void setHomepage_photo_content(String homepage_photo_content) {
		this.homepage_photo_content = homepage_photo_content;
	}
	public String getHomepage_photo_date() {
		return homepage_photo_date;
	}
	public void setHomepage_photo_date(String homepage_photo_date) {
		this.homepage_photo_date = homepage_photo_date;
	}
	public String getHomepage_photo_name() {
		return homepage_photo_name;
	}
	public void setHomepage_photo_name(String homepage_photo_name) {
		this.homepage_photo_name = homepage_photo_name;
	}
	
	
	
	
}
