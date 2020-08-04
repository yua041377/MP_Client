package kr.or.ddit.widu.vo.basket;

import java.io.Serializable;

public class BasketVO  implements Serializable{
	
	private int basket_id;
	private String mem_id;
	private int shop_id;
	private int shop_count;
	
	public BasketVO() {}
	 
	@Override
	public String toString() {
		return "BasketVO [basket_id=" + basket_id + ", mem_id=" + mem_id + ", shop_id=" + shop_id + ", shop_count="
				+ shop_count + "]";
	}
	
	public BasketVO(int basket_id, String mem_id, int shop_id, int shop_count) {
		super();
		this.basket_id = basket_id;
		this.mem_id = mem_id;
		this.shop_id = shop_id;
		this.shop_count = shop_count;
	}
	public int getBasket_id() {
		return basket_id;
	}
	public void setBasket_id(int basket_id) {
		this.basket_id = basket_id;
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
	public int getShop_count() {
		return shop_count;
	}
	public void setShop_count(int shop_count) {
		this.shop_count = shop_count;
	}
	
	
	
	
}
