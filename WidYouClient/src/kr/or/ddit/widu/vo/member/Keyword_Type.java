package kr.or.ddit.widu.vo.member;

import java.io.Serializable;

public class Keyword_Type implements Serializable {
	
	private int keytype_id;
	private String mem_id;
	private String keyword_face;
	private String keyword_character;
	private String keyword_hobby;
	private String keyword_etc;
	private String love_type;
	private String same_face;
	
	public Keyword_Type() {}
	
	public Keyword_Type(int keytype_id, String mem_id, String keyword_face, String keyword_character,
			String keyword_hobby, String keyword_etc, String love_type, String same_face) {
		super();
		this.keytype_id = keytype_id;
		this.mem_id = mem_id;
		this.keyword_face = keyword_face;
		this.keyword_character = keyword_character;
		this.keyword_hobby = keyword_hobby;
		this.keyword_etc = keyword_etc;
		this.love_type = love_type;
		this.same_face = same_face;
	}
	@Override
	public String toString() {
		return "Keyword_Type [keytype_id=" + keytype_id + ", mem_id=" + mem_id + ", keyword_face=" + keyword_face
				+ ", keyword_character=" + keyword_character + ", keyword_hobby=" + keyword_hobby + ", keyword_etc="
				+ keyword_etc + ", love_type=" + love_type + ", same_face=" + same_face + "]";
	}
	public int getKeytype_id() {
		return keytype_id;
	}
	public void setKeytype_id(int keytype_id) {
		this.keytype_id = keytype_id;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getKeyword_face() {
		return keyword_face;
	}
	public void setKeyword_face(String keyword_face) {
		this.keyword_face = keyword_face;
	}
	public String getKeyword_character() {
		return keyword_character;
	}
	public void setKeyword_character(String keyword_character) {
		this.keyword_character = keyword_character;
	}
	public String getKeyword_hobby() {
		return keyword_hobby;
	}
	public void setKeyword_hobby(String keyword_hobby) {
		this.keyword_hobby = keyword_hobby;
	}
	public String getKeyword_etc() {
		return keyword_etc;
	}
	public void setKeyword_etc(String keyword_etc) {
		this.keyword_etc = keyword_etc;
	}
	public String getLove_type() {
		return love_type;
	}
	public void setLove_type(String love_type) {
		this.love_type = love_type;
	}
	public String getSame_face() {
		return same_face;
	}
	public void setSame_face(String same_face) {
		this.same_face = same_face;
	}
	
	
	
	
}
