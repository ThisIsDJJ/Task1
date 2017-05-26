package com.djj.task1.ConnectionPool;
import java.beans.PropertyVetoException;  
import java.sql.Connection;  
import java.sql.SQLException;  
import com.mchange.v2.c3p0.ComboPooledDataSource;  
  
public final class ConnectionManager {  
    /*　连接池管理类是连接池类的外覆类（wrapper）,符合单例模式，即系统中只能有一个连接池管理类的实例。
     * 其主要用于对多个连接池对象的管     * 如下使用单例模式创建数据库连接池
     * 本例中使用的是懒汉式单例  要用的时候才 new 本类对象 然而我说的什么鬼我自己也不造又啥用*/ 
    private static ConnectionManager instance;  
    //获取数据库连接的连接池 datasource
    private static ComboPooledDataSource dataSource;  
  
    private ConnectionManager() throws SQLException, PropertyVetoException {  
        //新建连接池对象
    	dataSource = new ComboPooledDataSource();  
    	
        dataSource.setUser("root");     //用户名  
        dataSource.setPassword("123456"); //密码  
      //设置连接数据库的地址  
        dataSource.setJdbcUrl("jdbc:mysql://139.199.74.115:3306/students?useSSL=false");
      //设置连接驱动  
        dataSource.setDriverClass("com.mysql.jdbc.Driver");  
        dataSource.setInitialPoolSize(5); //初始化连接数  
        dataSource.setMinPoolSize(1);//最小连接数  
        dataSource.setMaxPoolSize(10);//最大连接数  
        dataSource.setMaxStatements(50);//最长等待时间  
        dataSource.setMaxIdleTime(60);//最大空闲时间，单位毫秒  
    }  
  //获取连接池管理类的方法 只能通过getInstance 来访问对象 
    public static final ConnectionManager getInstance() {  
        if (instance == null) {  
            try {  
                instance = new ConnectionManager();  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }  
        return instance;  
    }  
  
    public synchronized final Connection getConnection() {  
    	Connection conn = null ;  
        try {  
        	conn = dataSource.getConnection();  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
        return conn;  
    }  
}  
