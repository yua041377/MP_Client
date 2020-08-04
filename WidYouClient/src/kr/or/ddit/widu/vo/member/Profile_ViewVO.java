package kr.or.ddit.widu.vo.member;

import java.io.Serializable;

public class Profile_ViewVO implements Serializable {
	
	private int view_id;
	private String mem_id;
	private String view_mem_id;
	private String view_date;
	
	public Profile_ViewVO() {}
	
	public Profile_ViewVO(int view_id, String mem_id, String view_mem_id, String view_date) {
		super();
		this.view_id = view_id;
		this.mem_id = mem_id;
		this.view_mem_id = view_mem_id;
		this.view_date = view_date;
	}
	@Override
	public String toString() {
		return "Profile_ViewVO [view_id=" + view_id + ", mem_id=" + mem_id + ", view_mem_id=" + view_mem_id
				+ ", view_date=" + view_date + "]";
	}
	public int getView_id() {
		return view_id;
	}
	public void setView_id(int view_id) {
		this.view_id = view_id;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getView_mem_id() {
		return view_mem_id;
	}
	public void setView_mem_id(String view_mem_id) {
		this.view_mem_id = view_mem_id;
	}
	public String getView_date() {
		return view_date;
	}
	public void setView_date(String view_date) {
		this.view_date = view_date;
	}
	
	
}
