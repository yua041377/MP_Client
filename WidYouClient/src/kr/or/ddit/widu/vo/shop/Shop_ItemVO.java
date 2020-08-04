package kr.or.ddit.widu.vo.shop;

import java.io.Serializable;

public class Shop_ItemVO implements Serializable{
	
	private int shop_id;
	private String shop_name;
	private String shop_detail;
	private int shop_price;
	private String shop_picture;
	private String cnt;

	public Shop_ItemVO() {}

	public Shop_ItemVO(int shop_id, String shop_name, String shop_detail, int shop_price, String shop_picture,
			String cnt) {
		super();
		this.shop_id = shop_id;
		this.shop_name = shop_name;
		this.shop_detail = shop_detail;
		this.shop_price = shop_price;
		this.shop_picture = shop_picture;
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "Shop_ItemVO [shop_id=" + shop_id + ", shop_name=" + shop_name + ", shop_detail=" + shop_detail
				+ ", shop_price=" + shop_price + ", shop_picture=" + shop_picture + ", cnt=" + cnt + "]";
	}

	public int getShop_id() {
		return shop_id;
	}

	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}

	public String getShop_name() {
		return shop_name;
	}

	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}

	public String getShop_detail() {
		return shop_detail;
	}

	public void setShop_detail(String shop_detail) {
		this.shop_detail = shop_detail;
	}

	public int getShop_price() {
		return shop_price;
	}

	public void setShop_price(int shop_price) {
		this.shop_price = shop_price;
	}

	public String getShop_picture() {
		return shop_picture;
	}

	public void setShop_picture(String shop_picture) {
		this.shop_picture = shop_picture;
	}

	public String getCnt() {
		return cnt;
	}

	public void setCnt(String cnt) {
		this.cnt = cnt;
	}
}
