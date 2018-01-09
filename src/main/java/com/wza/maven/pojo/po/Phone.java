package com.wza.maven.pojo.po;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Phone {
	@Value("HUAWEI")
	private String name;
	@Value("3800")
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Phone() {
		System.out.println("hello,world again");
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
}
