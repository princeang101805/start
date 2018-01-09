package com.wza.maven.pojo.po;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("12315")
	private String id;
	@Value("andy")
	private String name;
	@Autowired
	private Phone phone;
	
	
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student() {
		System.out.println("hello,world");
	}

	public Student(String id, String name, Phone phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		System.out.println("========");
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}

}
