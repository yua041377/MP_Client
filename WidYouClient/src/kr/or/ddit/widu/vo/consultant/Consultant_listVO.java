package kr.or.ddit.widu.vo.consultant;

import java.io.Serializable;

public class Consultant_listVO implements Serializable {
	
	private int con_list_id;
	private int con_id;
	private int mem_id;
	private String con_list_content;
	
	public Consultant_listVO() {}
	
	public Consultant_listVO(int con_list_id, int con_id, int mem_id, String con_list_content) {
		super();
		this.con_list_id = con_list_id;
		this.con_id = con_id;
		this.mem_id = mem_id;
		this.con_list_content = con_list_content;
	}
	
	@Override
	public String toString() {
		return "Consultant_listVO [con_list_id=" + con_list_id + ", con_id=" + con_id + ", mem_id=" + mem_id
				+ ", con_list_content=" + con_list_content + "]";
	}
	
	public int getCon_list_id() {
		return con_list_id;
	}
	public void setCon_list_id(int con_list_id) {
		this.con_list_id = con_list_id;
	}
	public int getCon_id() {
		return con_id;
	}
	public void setCon_id(int con_id) {
		this.con_id = con_id;
	}
	public int getMem_id() {
		return mem_id;
	}
	public void setMem_id(int mem_id) {
		this.mem_id = mem_id;
	}
	public String getCon_list_content() {
		return con_list_content;
	}
	public void setCon_list_content(String con_list_content) {
		this.con_list_content = con_list_content;
	}
	
	
	
}
