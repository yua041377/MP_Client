package kr.or.ddit.vo;

public class AttendanceVO {
	
	private int att_id;
	private String mem_id;
	private String att_date;
	
	public AttendanceVO() {}
	
	public AttendanceVO(int att_id, String mem_id, String att_date) {
		super();
		this.att_id = att_id;
		this.mem_id = mem_id;
		this.att_date = att_date;
	}

	@Override
	public String toString() {
		return "AttendanceVO [att_id=" + att_id + ", mem_id=" + mem_id + ", att_date=" + att_date + "]";
	}
	
	public int getAtt_id() {
		return att_id;
	}
	public void setAtt_id(int att_id) {
		this.att_id = att_id;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getAtt_date() {
		return att_date;
	}
	public void setAtt_date(String att_date) {
		this.att_date = att_date;
	}
	
	
	
}
