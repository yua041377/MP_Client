package kr.or.ddit.widu.vo.member;

import java.io.Serializable;

public class MatchingVO implements Serializable {
	
	private int matching_id;
	private String mem_id_first;
	private String mem_id_second;
	private String matching_agree;
	private String matching_date;
	private String matching_category;
	
	public MatchingVO() {}
	
	public MatchingVO(int matching_id, String mem_id_first, String mem_id_second, String matching_agree,
			String matching_date, String matching_category) {
		super();
		this.matching_id = matching_id;
		this.mem_id_first = mem_id_first;
		this.mem_id_second = mem_id_second;
		this.matching_agree = matching_agree;
		this.matching_date = matching_date;
		this.matching_category = matching_category;
	}
	@Override
	public String toString() {
		return "MatchingVO [matching_id=" + matching_id + ", mem_id_first=" + mem_id_first + ", mem_id_second="
				+ mem_id_second + ", matching_agree=" + matching_agree + ", matching_date=" + matching_date
				+ ", matching_category=" + matching_category + "]";
	}
	public int getMatching_id() {
		return matching_id;
	}
	public void setMatching_id(int matching_id) {
		this.matching_id = matching_id;
	}
	public String getMem_id_first() {
		return mem_id_first;
	}
	public void setMem_id_first(String mem_id_first) {
		this.mem_id_first = mem_id_first;
	}
	public String getMem_id_second() {
		return mem_id_second;
	}
	public void setMem_id_second(String mem_id_second) {
		this.mem_id_second = mem_id_second;
	}
	public String getMatching_agree() {
		return matching_agree;
	}
	public void setMatching_agree(String matching_agree) {
		this.matching_agree = matching_agree;
	}
	public String getMatching_date() {
		return matching_date;
	}
	public void setMatching_date(String matching_date) {
		this.matching_date = matching_date;
	}
	public String getMatching_category() {
		return matching_category;
	}
	public void setMatching_category(String matching_category) {
		this.matching_category = matching_category;
	}
	
	
}
