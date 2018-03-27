package com.pets.dto;

public class EvaluateDTO {

	private Long id;
	private String message;
	private Long userid;
	private String username;
	private String title;
	private String answer;
	
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "EvaluateDTO [id=" + id + ", message=" + message + ", userid=" + userid + ", username=" + username
				+ ", title=" + title + ", isDeleted=" + isDeleted + ", petsid=" + petsid + "]";
	}
	public Long getOrderid() {
		return orderid;
	}
	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}
	private Boolean isDeleted;
	private Long petsid;
	private Long orderid;
	
	
	public Long getPetsid() {
		return petsid;
	}
	public void setPetsid(Long petsid) {
		this.petsid = petsid;
	}
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	
	
	
	
}
