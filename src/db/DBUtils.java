package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author GZhi·Dao
 * @time 2017年2月11日 下午11:42:24
 * @functions 链接数据库
 */
public class DBUtils {
	//static :静态的
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/imooc?useUnicode=true&amp;characterEncoding=utf-8";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	//private static Connection conn;
	
	private static Connection conn = null;
	
	static { //静态块是执行的最早的
		try {
			//1.加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			//2.获得数据库链接
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() { //对外提供方法 ，获取数据库链接
		return conn;
	}

	

//	public static void setConn(Connection conn) {
//		DBUtils.conn = conn;
//	}
	
//	@SuppressWarnings("unused")
//	public static void main(String[] args)
//	{
//		try {
//			//1.加载驱动程序
//			Class.forName("com.mysql.jdbc.Driver");
//			//2.获得数据库链接
//			Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
//			//3.通过数据库的链接操作数据库，实现增删改查
//			Statement stmt = conn.createStatement();
//			//4.获取数据库中的指定信息
//			ResultSet rs = stmt.executeQuery("select user_name,age from imooc_goddess");
//			
//			while(rs.next()){ //5.有数据循环打印...
//				System.out.println("我的姓名叫"+ rs.getString("user_name") + ",年龄是"+rs.getInt("age") + "岁，是舅舅帮我添加的信息的！");
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}catch (ClassNotFoundException e1) {
//			e1.printStackTrace();
//		}
//	}
	
	
}
