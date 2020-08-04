package kr.or.ddit.widu.vo.chatting;

import java.io.Serializable;

public class ChattingVO implements Serializable {
	
	private String chatting_id;
	private String mem_id_first;
	private String mem_id_second;
	private String chatting_content;
	
	public ChattingVO() {}
	
	public ChattingVO(String chatting_id, String mem_id_first, String mem_id_second, String chatting_content) {
		super();
		this.chatting_id = chatting_id;
		this.mem_id_first = mem_id_first;
		this.mem_id_second = mem_id_second;
		this.chatting_content = chatting_content;
	}
	
	@Override
	public String toString() {
		return "Chatting [chatting_id=" + chatting_id + ", mem_id_first=" + mem_id_first + ", mem_id_second="
				+ mem_id_second + ", chatting_content=" + chatting_content + "]";
	}
	public String getChatting_id() {
		return chatting_id;
	}
	public void setChatting_id(String chatting_id) {
		this.chatting_id = chatting_id;
	}
	public String getMem_id_first() {
		return mem_id_first;
	}
	public void setMem_id_first(String mem_id_first) {
		this.mem_id_first = mem_id_first;
	}
	public String getMem_id_second() {
		return mem_id_second;
	}
	public void setMem_id_second(String mem_id_second) {
		this.mem_id_second = mem_id_second;
	}
	public String getChatting_content() {
		return chatting_content;
	}
	public void setChatting_content(String chatting_content) {
		this.chatting_content = chatting_content;
	}
	
	
	
	
}
