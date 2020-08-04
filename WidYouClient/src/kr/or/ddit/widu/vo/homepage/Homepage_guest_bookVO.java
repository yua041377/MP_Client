package kr.or.ddit.widu.vo.homepage;

import java.io.Serializable;

public class Homepage_guest_bookVO implements Serializable {
	
	private int guest_id;
	private int homepage_id;
	private String guest_mem_id;
	private String guest_content;
	private String guest_date;
	
	public Homepage_guest_bookVO() {}
	
	@Override
	public String toString() {
		return "Homepage_guest_bookVO [guest_id=" + guest_id + ", homepage_id=" + homepage_id + ", guest_mem_id="
				+ guest_mem_id + ", guest_content=" + guest_content + ", guest_date=" + guest_date + "]";
	}
	public Homepage_guest_bookVO(int guest_id, int homepage_id, String guest_mem_id, String guest_content,
			String guest_date) {
		super();
		this.guest_id = guest_id;
		this.homepage_id = homepage_id;
		this.guest_mem_id = guest_mem_id;
		this.guest_content = guest_content;
		this.guest_date = guest_date;
	}
	public int getGuest_id() {
		return guest_id;
	}
	public void setGuest_id(int guest_id) {
		this.guest_id = guest_id;
	}
	public int getHomepage_id() {
		return homepage_id;
	}
	public void setHomepage_id(int homepage_id) {
		this.homepage_id = homepage_id;
	}
	public String getGuest_mem_id() {
		return guest_mem_id;
	}
	public void setGuest_mem_id(String guest_mem_id) {
		this.guest_mem_id = guest_mem_id;
	}
	public String getGuest_content() {
		return guest_content;
	}
	public void setGuest_content(String guest_content) {
		this.guest_content = guest_content;
	}
	public String getGuest_date() {
		return guest_date;
	}
	public void setGuest_date(String guest_date) {
		this.guest_date = guest_date;
	}
	
	
	
}
