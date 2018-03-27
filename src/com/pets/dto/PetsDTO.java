package com.pets.dto;

public class PetsDTO {
    private Long tid;
    
	public Long getTid() {
		return tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private Float sale;
	
	public Float getSale() {
		return sale;
	}
	public void setSale(Float sale) {
		this.sale = sale;
	}
	@Override
	public String toString() {
		return "PetsDTO [id=" + id + ", name=" + name + ", age=" + age + ", type=" + type + ", description="
				+ description + ", image=" + image + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getAge() {
		return age;
	}
	public void setAge(Float f) {
		this.age = f;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	private String name;
	private Float age;
	private String type;
	private String description;
	private String image;
	
	
	
}
