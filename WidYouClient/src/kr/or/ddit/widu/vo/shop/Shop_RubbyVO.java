package kr.or.ddit.widu.vo.shop;

import java.io.Serializable;

public class Shop_RubbyVO implements Serializable{
	
	private int rubby_id;
	private String rubby_name;
	private int rubby_price;
	private int rubby_count;
	
	public Shop_RubbyVO() {}
	
	public Shop_RubbyVO(int rubby_id, String rubby_name, int rubby_price, int rubby_count) {
		super();
		this.rubby_id = rubby_id;
		this.rubby_name = rubby_name;
		this.rubby_price = rubby_price;
		this.rubby_count = rubby_count;
	}
	@Override
	public String toString() {
		return "Shop_RubbyVO [rubby_id=" + rubby_id + ", rubby_name=" + rubby_name + ", rubby_price=" + rubby_price
				+ ", rubby_count=" + rubby_count + "]";
	}
	public int getRubby_id() {
		return rubby_id;
	}
	public void setRubby_id(int rubby_id) {
		this.rubby_id = rubby_id;
	}
	public String getRubby_name() {
		return rubby_name;
	}
	public void setRubby_name(String rubby_name) {
		this.rubby_name = rubby_name;
	}
	public int getRubby_price() {
		return rubby_price;
	}
	public void setRubby_price(int rubby_price) {
		this.rubby_price = rubby_price;
	}
	public int getRubby_count() {
		return rubby_count;
	}
	public void setRubby_count(int rubby_count) {
		this.rubby_count = rubby_count;
	}
	
	
	
}
