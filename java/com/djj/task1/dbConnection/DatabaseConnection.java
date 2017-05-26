package com.djj.task1.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.djj.task1.student.Student;

public class DatabaseConnection {
	//想要连接的数据库的驱动
	private static final String DBDRIVER = "com.mysql.jdbc.Driver";
	private static final String DBURL = "jdbc:mysql://139.199.74.115:3306/students?useSSL=false";
	private static final String DBUSER = "root";
	private static final String DBPASSWORD = "123456";
	private Connection conn;
	//连接到数据库
	public  DatabaseConnection()  {
		try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("找不到驱动程序类，加载驱动失败");
			e.printStackTrace();
		}
		try {
			this.conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
		} catch (SQLException e) {
			System.out.println("数据库连接失败");
			e.printStackTrace();
		}
	}

	public Connection getConnection(){
		return this.conn;
	}
	//这里是写错了嘛？？？

	//		private PreparedStatement pstmt ;
	//		public void doCreate(Student student) throws SQLException{
	//			//数据库插入语句
	//			String sql = "INSERT INTO student1(id,name,type,time,school,online_id,wish,rec_senior,create_at,update_at)VALUES(?,?,?,?,?,?,?,?,?,?)";
	//			//prepareStatement 用于执行sql语句
	//			this.pstmt = this.conn.prepareStatement(sql);
	//		}

	public void close() throws Exception{
		if(this.conn != null){
			try{
				this.conn.close();
			}catch(Exception e){
				throw e;
			}
		}}}




