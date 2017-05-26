package com.djj.task1.daoImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;

import com.djj.task1.dao.StudentDao;
import com.djj.task1.student.Student;

public class StudentDaoImpl implements StudentDao{
	 int ID ;
	private Connection conn;
	private PreparedStatement pstmt;

	//有参构造  impl实现类用于操作数据库        该类一创建对象就获取数据库连接
	public StudentDaoImpl(Connection conn){
		this.conn = conn;
	}
	//重写父类的docreate方法
	public boolean doCreate(Student student){
		boolean flag = false;
		String sql = "INSERT INTO student1(id,name,type,time,school,online_id,wish,rec_senior,create_at,update_at)"
				+ "VALUES(default,?,?,?,?,?,?,?,?,?)";
		try {
			this.pstmt = this.conn.prepareStatement(sql);
//			this.pstmt.setInt(1,student.getId());
			this.pstmt.setString(1,student.getName());
			this.pstmt.setString(2,student.getType());
			this.pstmt.setDate(3, (java.sql.Date) student.getTime());
			this.pstmt.setString(4,student.getSchool());
			this.pstmt.setInt(5,student.getOnline_id());
			this.pstmt.setString(6,student.getWish());
			this.pstmt.setString(7,student.getRec_senior());
			this.pstmt.setString(8,student.getCreate_at());
			this.pstmt.setDate(9,(java.sql.Date) student.getUpdate_at());
			if(this.pstmt.executeUpdate() > 0){
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				this.pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	public boolean doDelete(Student student){
		String sql = "DELETE FROM student1 WHERE "+ID;
		try {
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				this.pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
//	
//	
//	public boolean doUpdate(Student student){
//		String sql = "UPDATE student1 SET wish ='老大最帅' WHERE id =3;";
//		try {
//			this.pstmt = this.conn.prepareStatement(sql);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return false;
//	}
//	public boolean doSelect(Student student){
//		String sql = "SELECT * FROM student1 WHERE wish ='老大最帅';";
//		try {
//			this.pstmt = this.conn.prepareStatement(sql);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return false;
//	}
	
}
