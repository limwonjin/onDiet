package com.onDiet.vo;

public class Member {
	private String id;
	private String pass;
	private String name;
	private String age;
	private String gender;
	private String height;
	private String weight;
	private String image;
	private String train_yn;
	
	public Member() {}
	
	public Member(String id, String pass) {
		this.id = id;
		this.pass = pass;
	}

	public Member(String id, String pass, String name, String age, String gender, String height, String weight,
			String image, String train_yn) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.image = image;
		this.train_yn = train_yn;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getheight() {
		return height;
	}
	public void setheight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getTrain_yn() {
		return train_yn;
	}
	public void setTrain_yn(String train_yn) {
		this.train_yn = train_yn;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pass=" + pass + "]";
	}
	
}
