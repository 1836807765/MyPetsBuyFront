package com.pets.dto;

public class OrderDTO {


	private Long id;
	private Long userid;
	private Long petsid;
	private Boolean isDeleted;
	
	public Long getId() {
		return id;
	}
	
	
	
	
	public Boolean getIsDeleted() {
		return isDeleted;
	}




	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}




	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public Long getPetsid() {
		return petsid;
	}
	public void setPetsid(Long petsid) {
		this.petsid = petsid;
	}
	
}
