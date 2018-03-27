package com.pets.dto;

import java.util.List;

public class UserDTO {
	private String name ;
	private String email;
	private String major;
	
public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
@Override
public String toString() {
	return "UserDTO [name=" + name + ", email=" + email + ", password=" + password + ", score=" + score + ", Id=" + Id
			+ ", money=" + money + ", address=" + address + ", phone=" + phone + "]";
}
 private String description;
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
private String password;
	private Long score;
	private Long Id;
	private float money;
	private String address;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	private String phone;
	
//	private List<Long> number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getScore() {
		return score;
	}
	public void setScore(Long score) {
		this.score = score;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	
	
	

}
