package com.example.demo.bean;

import java.io.Serializable;
//实体类需要实现序列化接口
public class Goods implements Serializable{
	
	private int id;
	private String name;
	private String password;
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goods(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
	

}
