package com.dj.dao.spring;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.dj.domain.Student;

public interface SpringStudentDao {
	//新建学生
	@Insert("insert into student1_copy1 (name,qq,type,time,school,online_id,wish,rec_senior,create_at) "
			+ "values (#{name},#{qq},#{type},#{time},#{school},#{onlineId},#{wish},#{recSenior},#{createAt})")
	public long insert(Student student);
	//按id更新学生数据
	@Update("update student1_copy1 set id=#{id},qq=#{qq},name=#{name},type=#{type},time=#{time},school=#{school},online_id=#{onlineId},wish=#{wish},rec_senior=#{recSenior}} where id=#{id}")
    public boolean update(Student student);
    
    @Delete("delete from student1_copy1 where id=#{id}")
    public boolean delete(long id);

    
    @Select("select count(*) c from student1_copy1;")
    public int countAll();
    
    @Select("select * from student1_copy1 where id=#{id}")
    public Student findByStudentId(long id);
    
    

}
