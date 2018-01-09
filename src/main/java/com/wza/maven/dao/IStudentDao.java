package com.wza.maven.dao;

import org.springframework.stereotype.Repository;

import com.wza.maven.pojo.po.Student1;

@Repository
public interface IStudentDao {
	void save(Student1 stu);
	void delete(Integer id);
	void update(Student1 stu);
}
