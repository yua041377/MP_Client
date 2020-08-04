package kr.or.ddit.widu.vo.member;

import java.io.Serializable;

public class Hate_tableVO implements Serializable {
	
	private int hate_id;
	private String mem_id;
	private String target_mem_id;
	
	public Hate_tableVO() {}
	
	public Hate_tableVO(int hate_id, String mem_id, String target_mem_id) {
		super();
		this.hate_id = hate_id;
		this.mem_id = mem_id;
		this.target_mem_id = target_mem_id;
	}
	
	@Override
	public String toString() {
		return "Hate_tableVO [hate_id=" + hate_id + ", mem_id=" + mem_id + ", target_mem_id=" + target_mem_id + "]";
	}
	
	public int getHate_id() {
		return hate_id;
	}
	public void setHate_id(int hate_id) {
		this.hate_id = hate_id;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getTarget_mem_id() {
		return target_mem_id;
	}
	public void setTarget_mem_id(String target_mem_id) {
		this.target_mem_id = target_mem_id;
	}
	
	
	
}
