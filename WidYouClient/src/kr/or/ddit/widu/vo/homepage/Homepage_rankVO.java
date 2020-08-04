package kr.or.ddit.widu.vo.homepage;

import java.io.Serializable;

public class Homepage_rankVO implements Serializable {
	
	private int rank_id;
	private String rank_name;
	private String rank_condition;
	
	public Homepage_rankVO() {}
	
	@Override
	public String toString() {
		return "Homepage_rankVO [rank_id=" + rank_id + ", rank_name=" + rank_name + ", rank_condition=" + rank_condition
				+ "]";
	}
	public Homepage_rankVO(int rank_id, String rank_name, String rank_condition) {
		super();
		this.rank_id = rank_id;
		this.rank_name = rank_name;
		this.rank_condition = rank_condition;
	}
	public int getRank_id() {
		return rank_id;
	}
	public void setRank_id(int rank_id) {
		this.rank_id = rank_id;
	}
	public String getRank_name() {
		return rank_name;
	}
	public void setRank_name(String rank_name) {
		this.rank_name = rank_name;
	}
	public String getRank_condition() {
		return rank_condition;
	}
	public void setRank_condition(String rank_condition) {
		this.rank_condition = rank_condition;
	}
	
	
	
}
