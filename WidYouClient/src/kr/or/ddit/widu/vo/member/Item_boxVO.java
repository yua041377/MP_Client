package kr.or.ddit.widu.vo.member;

import java.io.Serializable;

public class Item_boxVO implements Serializable {
	
	private int item_box_id;
	private String mem_id;
	private int shop_id;
	
	public Item_boxVO() {}
	
	public Item_boxVO(int item_box_id, String mem_id, int shop_id) {
		super();
		this.item_box_id = item_box_id;
		this.mem_id = mem_id;
		this.shop_id = shop_id;
	}
	@Override
	public String toString() {
		return "Item_boxVO [item_box_id=" + item_box_id + ", mem_id=" + mem_id + ", shop_id=" + shop_id + "]";
	}
	public int getItem_box_id() {
		return item_box_id;
	}
	public void setItem_box_id(int item_box_id) {
		this.item_box_id = item_box_id;
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
	
	
	
	
}
