package com.dj.ConnectionPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

import com.mysql.jdbc.PreparedStatement;

public class MyThread1 extends Thread {
	public void run() {
		String url = "jdbc:mysql://139.199.74.115:3306/students?useSSL=false";

		String name = "com.mysql.jdbc.Driver";

		String user = "root";

		String password = "123456";

		Connection conn = null;
		try {
			Class.forName(name);
			conn = DriverManager.getConnection(url, user, password);
			// 关闭自动提交
			conn.setAutoCommit(false);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Long begin = new Date().getTime();
//		 String prefix = "INSERT INTO entry_form (name,qq,profession) VALUES ";
		String prefix = "INSERT INTO student1(name,type,time,school,online_id,wish,rec_senior,create_at,update_at) VALUES";
		try {
			StringBuffer suffix = new StringBuffer();
			conn.setAutoCommit(false);
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement("");// 准备执行语句
			// 外层循环，总提交事务次数
			for (int i = 1; i <= 10; i++) {
				suffix = new StringBuffer();
				for (int j = 1; j <= 100000; j++) {			
					suffix.append("('"+ "小黑'"+ ",'java'"
							+ ",'20170516'"
							+ ",'hust'"
							+ ",'111'"
							+ ",'11111'"
							+ ",'111'"
							+ ",'20170522'"
							+ ",'20170522')"
							+ ",");
				}
				String sql = prefix + suffix.substring(0, suffix.length() - 1);
//				System.out.println(sql);
				pst.addBatch(sql);
				pst.executeBatch();			
				conn.commit();
				suffix = new StringBuffer();
			}
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Long end = new Date().getTime();
		System.out.println("100万条数据插入花费时间 : " + (end - begin) / 1000 + " s" + "  插入完成");
	}
}
