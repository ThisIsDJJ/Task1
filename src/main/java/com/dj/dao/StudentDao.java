package com.dj.dao;

import com.dj.domain.Student;

public interface  StudentDao {
	//创建学生
	public boolean doCreate(Student student);
	public boolean doDelete(Student student);
//	public boolean doUpdate(Student student);
//	public boolean doSelect(Student student);
}
