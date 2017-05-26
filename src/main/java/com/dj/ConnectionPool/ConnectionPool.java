package com.dj.ConnectionPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	//集合
	List<Connection> ls = new ArrayList<Connection>();
	
	int size;
	//构造方法 初始化  
	public ConnectionPool(int size){
		this.size = size;
		init();
	}
	
	private void init() {
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DBURL = "jdbc:mysql://139.199.74.115:3306/students?useSSL=false";
		final String DBUSER = "root";
		final String PASSWORD = "123456";
		
		try {
			//注册驱动
			Class.forName(JDBC_DRIVER);
			//获取连接 连接池中获取的连接数vnkd
			for(int i = 0;i<size;i++){
				Connection c = DriverManager.getConnection(DBURL,DBUSER,PASSWORD);
					//集合中添加一个Connection对象
					ls.add(c);
				
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	//获取连接
	public synchronized Connection getConnection(){
		while(ls.isEmpty()){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Connection c = ls.remove(0);
		return c;
	}
	//返还连接
	public synchronized void returnConnection(Connection c){
		ls.add(c);
		this.notify();
	}
}
