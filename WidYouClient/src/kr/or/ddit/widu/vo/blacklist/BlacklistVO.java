package kr.or.ddit.widu.vo.blacklist;

import java.io.Serializable;

public class BlacklistVO implements Serializable {
	
	private int black_id;
	private String mem_id;
	private String start_date;
	private String last_date;
	private String the_end   ;
	
	public BlacklistVO() {}
	
	@Override
	public String toString() {
		return "BlacklistVO [black_id=" + black_id + ", mem_id=" + mem_id + ", start_date=" + start_date
				+ ", last_date=" + last_date + ", the_end=" + the_end + "]";
	}

	public BlacklistVO(int black_id, String mem_id, String start_date, String last_date, String the_end) {
		super();
		this.black_id = black_id;
		this.mem_id = mem_id;
		this.start_date = start_date;
		this.last_date = last_date;
		this.the_end = the_end;
	}

	public int getBlack_id() {
		return black_id;
	}
	public void setBlack_id(int black_id) {
		this.black_id = black_id;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getLast_date() {
		return last_date;
	}
	public void setLast_date(String last_date) {
		this.last_date = last_date;
	}
	public String getThe_end() {
		return the_end;
	}
	public void setThe_end(String the_end) {
		this.the_end = the_end;
	}
	
	
	
	
}
