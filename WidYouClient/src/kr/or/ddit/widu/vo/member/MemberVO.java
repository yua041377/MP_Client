package kr.or.ddit.widu.vo.member;

import java.io.Serializable;

public class MemberVO implements Serializable{
	
	private String mem_id;
	private String mem_pw;
	private String mem_nick;
	private String mem_name;
	private String mem_gender;
	private String mem_birth;
	private String mem_location;
	private String mem_job;
	private String mem_drink;
	private String mem_smoke;
	private int mem_height;
	private int mem_weight;
	private String mem_religion;
	private String mem_hp;
	private String mem_email;
	private String mem_login;
	private int mem_report_count;
	private String mem_picture;
	
	
	public MemberVO() {}
	
	@Override
	public String toString() {
		return "MemberVO [mem_id=" + mem_id + ", mem_pw=" + mem_pw + ", mem_nick=" + mem_nick + ", mem_name=" + mem_name
				+ ", mem_gender=" + mem_gender + ", mem_birth=" + mem_birth + ", mem_location=" + mem_location
				+ ", mem_job=" + mem_job + ", mem_drink=" + mem_drink + ", mem_smoke=" + mem_smoke + ", mem_height="
				+ mem_height + ", mem_wieght=" + mem_weight + ", mem_religion=" + mem_religion + ", mem_hp=" + mem_hp
				+ ", mem_email=" + mem_email + ", mem_login=" + mem_login + ", mem_report_count=" + mem_report_count
				+ ", mem_picture=" + mem_picture + ", getMem_picture()=" + getMem_picture() + ", getMem_id()="
				+ getMem_id() + ", getMem_pw()=" + getMem_pw() + ", getMem_nick()=" + getMem_nick() + ", getMem_name()="
				+ getMem_name() + ", getMem_gender()=" + getMem_gender() + ", getMem_birth()=" + getMem_birth()
				+ ", getMem_location()=" + getMem_location() + ", getMem_job()=" + getMem_job() + ", getMem_drink()="
				+ getMem_drink() + ", getMem_smoke()=" + getMem_smoke() + ", getMem_height()=" + getMem_height()
				+ ", getMem_wieght()=" + getMem_weight() + ", getMem_religion()=" + getMem_religion() + ", getMem_hp()="
				+ getMem_hp() + ", getMem_email()=" + getMem_email() + ", getMem_login()=" + getMem_login()
				+ ", getMem_report_count()=" + getMem_report_count() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getMem_picture() {
		return mem_picture;
	}

	public void setMem_picture(String mem_picture) {
		this.mem_picture = mem_picture;
	}

	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_pw() {
		return mem_pw;
	}
	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}
	public String getMem_nick() {
		return mem_nick;
	}
	public void setMem_nick(String mem_nick) {
		this.mem_nick = mem_nick;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_gender() {
		return mem_gender;
	}
	public void setMem_gender(String mem_gender) {
		this.mem_gender = mem_gender;
	}
	public String getMem_birth() {
		return mem_birth;
	}
	public void setMem_birth(String mem_birth) {
		this.mem_birth = mem_birth;
	}
	public String getMem_location() {
		return mem_location;
	}
	public void setMem_location(String mem_location) {
		this.mem_location = mem_location;
	}
	public String getMem_job() {
		return mem_job;
	}
	public void setMem_job(String mem_job) {
		this.mem_job = mem_job;
	}
	public String getMem_drink() {
		return mem_drink;
	}
	public void setMem_drink(String mem_drink) {
		this.mem_drink = mem_drink;
	}
	public String getMem_smoke() {
		return mem_smoke;
	}
	public void setMem_smoke(String mem_smoke) {
		this.mem_smoke = mem_smoke;
	}
	public int getMem_height() {
		return mem_height;
	}
	public void setMem_height(int mem_height) {
		this.mem_height = mem_height;
	}
	public int getMem_weight() {
		return mem_weight;
	}
	public void setMem_weight(int mem_weight) {
		this.mem_weight = mem_weight;
	}
	public String getMem_religion() {
		return mem_religion;
	}
	public void setMem_religion(String mem_religion) {
		this.mem_religion = mem_religion;
	}
	public String getMem_hp() {
		return mem_hp;
	}
	public void setMem_hp(String mem_hp) {
		this.mem_hp = mem_hp;
	}
	public String getMem_email() {
		return mem_email;
	}
	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
	}
	public String getMem_login() {
		return mem_login;
	}
	public void setMem_login(String mem_login) {
		this.mem_login = mem_login;
	}
	public int getMem_report_count() {
		return mem_report_count;
	}
	public void setMem_report_count(int mem_report_count) {
		this.mem_report_count = mem_report_count;
	}
	
	
	
	
}
