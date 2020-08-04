package kr.or.ddit.widu.vo.alarm;

import java.io.Serializable;

public class AlarmVO implements Serializable {
	
	private int alarm_id;
	private String mem_id;
	private String alarm_comment;
	
	public AlarmVO() {}
	
	
	
	@Override
	public String toString() {
		return "AlarmVO [alarm_id=" + alarm_id + ", mem_id=" + mem_id + ", alarm_comment=" + alarm_comment + "]";
	}



	public AlarmVO(int alarm_id, String mem_id, String alarm_comment) {
		super();
		this.alarm_id = alarm_id;
		this.mem_id = mem_id;
		this.alarm_comment = alarm_comment;
	}



	public int getAlarm_id() {
		return alarm_id;
	}
	public void setAlarm_id(int alarm_id) {
		this.alarm_id = alarm_id;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getAlarm_comment() {
		return alarm_comment;
	}
	public void setAlarm_comment(String alarm_comment) {
		this.alarm_comment = alarm_comment;
	}
	
	
	
	
}
