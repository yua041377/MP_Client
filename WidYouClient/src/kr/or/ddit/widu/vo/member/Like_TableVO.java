package kr.or.ddit.widu.vo.member;

import java.io.Serializable;

public class Like_TableVO implements Serializable {
	
	private int like_id;
	private String mem_id;
	private String target_mem_id;
	
	public Like_TableVO() {}
	
	public Like_TableVO(int like_id, String mem_id, String target_mem_id) {
		super();
		this.like_id = like_id;
		this.mem_id = mem_id;
		this.target_mem_id = target_mem_id;
	}
	
	@Override
	public String toString() {
		return "Like_TableVO [like_id=" + like_id + ", mem_id=" + mem_id + ", target_mem_id=" + target_mem_id + "]";
	}
	
	public int getLike_id() {
		return like_id;
	}
	public void setLike_id(int like_id) {
		this.like_id = like_id;
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
