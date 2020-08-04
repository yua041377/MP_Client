package kr.or.ddit.widu.vo.member;

import java.io.Serializable;

public class Gift_boxVO implements Serializable {
	
	private int gift_id;
	private String mem_id;
	private String target_mem_id;
	private int shop_id;
	private String gift_comment;
	private String gift_date;
	
	public Gift_boxVO() {}
	
	public Gift_boxVO(int gift_id, String mem_id, String target_mem_id, int shop_id, String gift_comment,
			String gift_date) {
		super();
		this.gift_id = gift_id;
		this.mem_id = mem_id;
		this.target_mem_id = target_mem_id;
		this.shop_id = shop_id;
		this.gift_comment = gift_comment;
		this.gift_date = gift_date;
	}
	@Override
	public String toString() {
		return "Gift_box [gift_id=" + gift_id + ", mem_id=" + mem_id + ", target_mem_id=" + target_mem_id + ", shop_id="
				+ shop_id + ", gift_comment=" + gift_comment + ", gift_date=" + gift_date + "]";
	}
	public int getGift_id() {
		return gift_id;
	}
	public void setGift_id(int gift_id) {
		this.gift_id = gift_id;
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
	public int getShop_id() {
		return shop_id;
	}
	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}
	public String getGift_comment() {
		return gift_comment;
	}
	public void setGift_comment(String gift_comment) {
		this.gift_comment = gift_comment;
	}
	public String getGift_date() {
		return gift_date;
	}
	public void setGift_date(String gift_date) {
		this.gift_date = gift_date;
	}
	
	
	
	
}
