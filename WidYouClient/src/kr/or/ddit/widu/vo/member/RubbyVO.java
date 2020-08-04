package kr.or.ddit.widu.vo.member;

import java.io.Serializable;

public class RubbyVO implements Serializable {
	
	private int rubby_num;
	private String mem_id;
	private int rubby_count;
	
	public RubbyVO() {}
	
	@Override
	public String toString() {
		return "RubbyVO [rubby_num=" + rubby_num + ", mem_id=" + mem_id + ", rubby_count=" + rubby_count + "]";
	}
	
	public RubbyVO(int rubby_num, String mem_id, int rubby_count) {
		super();
		this.rubby_num = rubby_num;
		this.mem_id = mem_id;
		this.rubby_count = rubby_count;
	}
	
	public int getRubby_num() {
		return rubby_num;
	}
	public void setRubby_num(int rubby_num) {
		this.rubby_num = rubby_num;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public int getRubby_count() {
		return rubby_count;
	}
	public void setRubby_count(int rubby_count) {
		this.rubby_count = rubby_count;
	}
	
	
}
