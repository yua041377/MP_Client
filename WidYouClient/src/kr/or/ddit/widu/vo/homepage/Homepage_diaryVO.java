package kr.or.ddit.widu.vo.homepage;

import java.io.Serializable;

public class Homepage_diaryVO implements Serializable {
	
	private int homepage_diary_id;
	private int homepage_id;
	private String homepage_diary_title;
	private String homepage_diary_content;
	private String homepage_diary_date;
	
	public Homepage_diaryVO() {}
	
	@Override
	public String toString() {
		return "Homepage_diaryVO [homepage_diary_id=" + homepage_diary_id + ", homepage_id=" + homepage_id
				+ ", homepage_diary_title=" + homepage_diary_title + ", homepage_diary_content="
				+ homepage_diary_content + ", homepage_diary_date=" + homepage_diary_date + "]";
	}
	public Homepage_diaryVO(int homepage_diary_id, int homepage_id, String homepage_diary_title,
			String homepage_diary_content, String homepage_diary_date) {
		super();
		this.homepage_diary_id = homepage_diary_id;
		this.homepage_id = homepage_id;
		this.homepage_diary_title = homepage_diary_title;
		this.homepage_diary_content = homepage_diary_content;
		this.homepage_diary_date = homepage_diary_date;
	}
	public int getHomepage_diary_id() {
		return homepage_diary_id;
	}
	public void setHomepage_diary_id(int homepage_diary_id) {
		this.homepage_diary_id = homepage_diary_id;
	}
	public int getHomepage_id() {
		return homepage_id;
	}
	public void setHomepage_id(int homepage_id) {
		this.homepage_id = homepage_id;
	}
	public String getHomepage_diary_title() {
		return homepage_diary_title;
	}
	public void setHomepage_diary_title(String homepage_diary_title) {
		this.homepage_diary_title = homepage_diary_title;
	}
	public String getHomepage_diary_content() {
		return homepage_diary_content;
	}
	public void setHomepage_diary_content(String homepage_diary_content) {
		this.homepage_diary_content = homepage_diary_content;
	}
	public String getHomepage_diary_date() {
		return homepage_diary_date;
	}
	public void setHomepage_diary_date(String homepage_diary_date) {
		this.homepage_diary_date = homepage_diary_date;
	}
	
	
	
	
}
