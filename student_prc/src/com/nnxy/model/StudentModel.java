package com.nnxy.model;

public class StudentModel {
	private int id;//ID
	private String username;//用户名
	private int sex;//性别
	private int age;//年龄
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", username=" + username + ", sex=" + sex + ", age=" + age + "]";
	}
	public StudentModel(int id, String username, int sex, int age) {
		super();
		this.id = id;
		this.username = username;
		this.sex = sex;
		this.age = age;
	}

}
