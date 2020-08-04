package kr.or.ddit.widu.vo.report;

public class Report_BoardVO {
	
	private int report_id;
	private String report_com_id;
	private String report_bad_id;
	private String report_date;
	private String report_content;
	private String report_checked;
	
	public Report_BoardVO() {}
	
	@Override
	public String toString() {
		return "Report_BoardVO [report_id=" + report_id + ", report_com_id=" + report_com_id + ", report_bad_id="
				+ report_bad_id + ", report_date=" + report_date + ", report_content=" + report_content
				+ ", report_checked=" + report_checked + "]";
	}
	
	public Report_BoardVO(int report_id, String report_com_id, String report_bad_id, String report_date,
			String report_content, String report_checked) {
		super();
		this.report_id = report_id;
		this.report_com_id = report_com_id;
		this.report_bad_id = report_bad_id;
		this.report_date = report_date;
		this.report_content = report_content;
		this.report_checked = report_checked;
	}
	public int getReport_id() {
		return report_id;
	}
	public void setReport_id(int report_id) {
		this.report_id = report_id;
	}
	public String getReport_com_id() {
		return report_com_id;
	}
	public void setReport_com_id(String report_com_id) {
		this.report_com_id = report_com_id;
	}
	public String getReport_bad_id() {
		return report_bad_id;
	}
	public void setReport_bad_id(String report_bad_id) {
		this.report_bad_id = report_bad_id;
	}
	public String getReport_date() {
		return report_date;
	}
	public void setReport_date(String report_date) {
		this.report_date = report_date;
	}
	public String getReport_content() {
		return report_content;
	}
	public void setReport_content(String report_content) {
		this.report_content = report_content;
	}
	public String getReport_checked() {
		return report_checked;
	}
	public void setReport_checked(String report_checked) {
		this.report_checked = report_checked;
	}
	
	
	
	
}
