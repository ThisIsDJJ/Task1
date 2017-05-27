  package com.dj.dao;

import java.util.List;

import com.dj.domain.Student;
/*dao接口*/
public interface UserMapper {
	//新增学生
	public int insertStudent(Student student) throws Exception;
	//删除学生
	public int deleteStudent(int id) throws Exception;
	//修改学生
	public int updateStudent (Student student,int id) throws Exception;
	//根据id查询学生信息
	public Student selectStudentById(int id) throws Exception;
	//查询所有学生信息
	public List<Student> selectAllStudent() throws Exception;
	
}
