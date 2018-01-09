package com.wza.maven.factory;

import com.wza.maven.pojo.po.Student;

public class MyFactory {
	public static Student init(){	
		return new Student();
	}
}
