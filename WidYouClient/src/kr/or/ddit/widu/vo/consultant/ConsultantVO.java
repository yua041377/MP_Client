package kr.or.ddit.widu.vo.consultant;

import java.io.Serializable;

public class ConsultantVO implements Serializable {
	
	private int con_id;
	private String con_name;
	private String con_info;
	private int con_matching_count;
	private int con_success_count;
	
	public ConsultantVO() {}
	
	@Override
	public String toString() {
		return "ConsultantVO [con_id=" + con_id + ", con_name=" + con_name + ", con_info=" + con_info
				+ ", con_matching_count=" + con_matching_count + ", con_success_count=" + con_success_count + "]";
	}
	
	public ConsultantVO(int con_id, String con_name, String con_info, int con_matching_count, int con_success_count) {
		super();
		this.con_id = con_id;
		this.con_name = con_name;
		this.con_info = con_info;
		this.con_matching_count = con_matching_count;
		this.con_success_count = con_success_count;
	}
	
	public int getCon_id() {
		return con_id;
	}
	public void setCon_id(int con_id) {
		this.con_id = con_id;
	}
	public String getCon_name() {
		return con_name;
	}
	public void setCon_name(String con_name) {
		this.con_name = con_name;
	}
	public String getCon_info() {
		return con_info;
	}
	public void setCon_info(String con_info) {
		this.con_info = con_info;
	}
	public int getCon_matching_count() {
		return con_matching_count;
	}
	public void setCon_matching_count(int con_matching_count) {
		this.con_matching_count = con_matching_count;
	}
	public int getCon_success_count() {
		return con_success_count;
	}
	public void setCon_success_count(int con_success_count) {
		this.con_success_count = con_success_count;
	}
	
	
	
	
}
