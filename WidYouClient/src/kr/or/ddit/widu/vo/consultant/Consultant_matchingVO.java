package kr.or.ddit.widu.vo.consultant;

import java.io.Serializable;

public class Consultant_matchingVO implements Serializable {
	
	private int con_matching_id;
	private String mem_id;
	private int marching_id;
	private int con_id;
	
	public Consultant_matchingVO() {}
	
	public Consultant_matchingVO(int con_matching_id, String mem_id, int marching_id, int con_id) {
		super();
		this.con_matching_id = con_matching_id;
		this.mem_id = mem_id;
		this.marching_id = marching_id;
		this.con_id = con_id;
	}
	
	@Override
	public String toString() {
		return "Consultant_matchingVO [con_matching_id=" + con_matching_id + ", mem_id=" + mem_id + ", marching_id="
				+ marching_id + ", con_id=" + con_id + "]";
	}
	
	public int getCon_matching_id() {
		return con_matching_id;
	}
	public void setCon_matching_id(int con_matching_id) {
		this.con_matching_id = con_matching_id;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public int getMarching_id() {
		return marching_id;
	}
	public void setMarching_id(int marching_id) {
		this.marching_id = marching_id;
	}
	public int getCon_id() {
		return con_id;
	}
	public void setCon_id(int con_id) {
		this.con_id = con_id;
	}
	
	
	
	
}
