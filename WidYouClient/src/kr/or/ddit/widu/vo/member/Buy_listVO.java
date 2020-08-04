package kr.or.ddit.widu.vo.member;

import java.io.Serializable;

public class Buy_listVO implements Serializable {
	
	private int list_num;
	private String mem_id;
	private int shop_id;
	private String buy_date;
	
	public Buy_listVO() {}
	
	@Override
	public String toString() {
		return "Buy_listVO [list_num=" + list_num + ", mem_id=" + mem_id + ", shop_id=" + shop_id + ", buy_date="
				+ buy_date + "]";
	}

	public Buy_listVO(int list_num, String mem_id, int shop_id, String buy_date) {
		super();
		this.list_num = list_num;
		this.mem_id = mem_id;
		this.shop_id = shop_id;
		this.buy_date = buy_date;
	}
	
	public int getList_num() {
		return list_num;
	}
	public void setList_num(int list_num) {
		this.list_num = list_num;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public int getShop_id() {
		return shop_id;
	}
	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}
	public String getBuy_date() {
		return buy_date;
	}
	public void setBuy_date(String buy_date) {
		this.buy_date = buy_date;
	}
	
	
	
	
}
