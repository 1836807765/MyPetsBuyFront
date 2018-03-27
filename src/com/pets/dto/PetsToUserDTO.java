package com.pets.dto;

public class PetsToUserDTO {

	private String username;
	private String address;
	private String petsName;
	private Long id;
	private Boolean isDeleted;
	private String local;
	private String rname;
	private String phone;
	private String sale;
	private Long orderId;
	
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getSale() {
		return sale;
	}
	public void setSale(String sale) {
		this.sale = sale;
	}
	@Override
	public String toString() {
		return "PetsToUserDTO [username=" + username + ", address=" + address + ", petsName=" + petsName + ", id=" + id
				+ ", isDeleted=" + isDeleted + ", local=" + local + ", rname=" + rname + ", phone=" + phone + "]";
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPetsName() {
		return petsName;
	}
	public void setPetsName(String petsName) {
		this.petsName = petsName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
	
	
	
}
