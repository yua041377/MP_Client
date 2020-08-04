package kr.or.ddit.widu.vo.homepage;

import java.io.Serializable;

public class HomepageVO implements Serializable {
	
	private int homepage_id;
	private String mem_id;
	private int homepage_rank_id;
	private String homepage_color_item;
	private String homepage_font_item;
	private int homepage_view;
	private String homepage_state_m;
	
	public HomepageVO() {}
	
	public HomepageVO(int homepage_id, String mem_id, int homepage_rank_id, String homepage_color_item,
			String homepage_font_item, int homepage_view, String homepage_state_m) {
		super();
		this.homepage_id = homepage_id;
		this.mem_id = mem_id;
		this.homepage_rank_id = homepage_rank_id;
		this.homepage_color_item = homepage_color_item;
		this.homepage_font_item = homepage_font_item;
		this.homepage_view = homepage_view;
		this.homepage_state_m = homepage_state_m;
	}
	@Override
	public String toString() {
		return "Homepage [homepage_id=" + homepage_id + ", mem_id=" + mem_id + ", homepage_rank_id=" + homepage_rank_id
				+ ", homepage_color_item=" + homepage_color_item + ", homepage_font_item=" + homepage_font_item
				+ ", homepage_view=" + homepage_view + ", homepage_state_m=" + homepage_state_m + "]";
	}
	public int getHomepage_id() {
		return homepage_id;
	}
	public void setHomepage_id(int homepage_id) {
		this.homepage_id = homepage_id;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public int getHomepage_rank_id() {
		return homepage_rank_id;
	}
	public void setHomepage_rank_id(int homepage_rank_id) {
		this.homepage_rank_id = homepage_rank_id;
	}
	public String getHomepage_color_item() {
		return homepage_color_item;
	}
	public void setHomepage_color_item(String homepage_color_item) {
		this.homepage_color_item = homepage_color_item;
	}
	public String getHomepage_font_item() {
		return homepage_font_item;
	}
	public void setHomepage_font_item(String homepage_font_item) {
		this.homepage_font_item = homepage_font_item;
	}
	public int getHomepage_view() {
		return homepage_view;
	}
	public void setHomepage_view(int homepage_view) {
		this.homepage_view = homepage_view;
	}
	public String getHomepage_state_m() {
		return homepage_state_m;
	}
	public void setHomepage_state_m(String homepage_state_m) {
		this.homepage_state_m = homepage_state_m;
	}
	
	
	
}
