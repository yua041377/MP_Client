package kr.or.ddit.widu.vo.homepage;

import java.io.Serializable;

public class Homepage_musicVO implements Serializable {
	
	private int music_id;
	private String music_name;
	private int homepage_id;
	
	public Homepage_musicVO() {}
	
	@Override
	public String toString() {
		return "Homepage_musicVO [music_id=" + music_id + ", music_name=" + music_name + ", homepage_id=" + homepage_id
				+ "]";
	}
	public Homepage_musicVO(int music_id, String music_name, int homepage_id) {
		super();
		this.music_id = music_id;
		this.music_name = music_name;
		this.homepage_id = homepage_id;
	}
	public int getMusic_id() {
		return music_id;
	}
	public void setMusic_id(int music_id) {
		this.music_id = music_id;
	}
	public String getMusic_name() {
		return music_name;
	}
	public void setMusic_name(String music_name) {
		this.music_name = music_name;
	}
	public int getHomepage_id() {
		return homepage_id;
	}
	public void setHomepage_id(int homepage_id) {
		this.homepage_id = homepage_id;
	}
	
	
	
	
	
}
