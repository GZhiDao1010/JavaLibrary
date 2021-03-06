package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DBUtils;
import model.Goddess;

public class GoddessDao { //增加
	public void addGoddess(Goddess g)
	{
		Connection conn =  DBUtils.getConnection();
		String sql = "" +
				"insert into imooc_goddess"+
				"(user_name,sex,age,birthday,email,mobile,"+
				"create_user,create_date,update_user,update_date,isdel)"+
				"value(" + 
				"?,?,?,?,?,?,?,'2017-10-10',?,'2017-10-10',?)";//?表示相对应的参数赋值的占位符
		try {
			//将sql语句加载到数据库驱动中，但是没有直接执行
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ptmt.setString(1,g.getUser_name());
			ptmt.setInt(2,g.getSex());
			ptmt.setInt(3, g.getAge());
			ptmt.setDate(4,new Date(g.getBirthday().getTime()));
			ptmt.setString(5, g.getEmail());
			ptmt.setString(6, g.getMobile());
			ptmt.setString(7,g.getCreate_user());
			ptmt.setString(8, g.getUpdate_user());
			ptmt.setInt(9,g.getIsdel());
			ptmt.execute();//调用execute()才执行sql语句
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateGoddess(Goddess g)
	{
		Connection conn =  DBUtils.getConnection();
		String sql = "" +
				" update imooc_goddess "+
				" set user_name=?,sex=?,age=?,birthday=?,email=?,mobile=?, "+
				" create_date='2017-10-10',update_date='2017-10-10',isdel=?) "+
				" where id=? ";//?表示相对应的参数赋值的占位符
		try {
			//将sql语句加载到数据库驱动中，但是没有直接执行
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ptmt.setString(1,g.getUser_name());
			ptmt.setInt(2,g.getSex());
			ptmt.setInt(3, g.getAge());
			ptmt.setDate(4,new Date(g.getBirthday().getTime()));
			ptmt.setString(5, g.getEmail());
			ptmt.setString(6, g.getMobile());
			ptmt.setString(7,g.getUpdate_user());
			ptmt.setInt(8,g.getIsdel());
			ptmt.setInt(9,g.getId());
			ptmt.execute();//调用execute()才执行sql语句
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delGoddess(Integer id)
	{
		Connection conn =  DBUtils.getConnection();
		String sql = "" +
				" delete imooc_goddess "+
				" where id=? ";//?表示相对应的参数赋值的占位符
		try {
			//将sql语句加载到数据库驱动中，但是没有直接执行
			PreparedStatement ptmt = conn.prepareStatement(sql);
			
			ptmt.setInt(1,id);
			ptmt.execute();//调用execute()才执行sql语句
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void set(Integer id)
	{
		Connection conn =  DBUtils.getConnection();
		String sql = "" +
				" select * from imooc_goddess "+
				" where id=? ";//?表示相对应的参数赋值的占位符
		try {
			//将sql语句加载到数据库驱动中，但是没有直接执行
			PreparedStatement ptmt = conn.prepareStatement(sql);
			
			ptmt.setInt(1,id);
			ptmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//泛型编程 <>里面是类型
	//泛型编程：编译器帮你检查错误，防止运行错误
	public List<Goddess> query() throws SQLException //创建一个集合 ,先导入model的Goddess
	{
		Connection conn = DBUtils.getConnection();
		//3.通过数据库的链接操作数据库，实现增删改查
		Statement stmt = null;
		ResultSet rs;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select user_name,age from imooc_goddess");
			List<Goddess> gs = new ArrayList<Goddess>();
			Goddess g = null;
			while(rs.next()){ //5.有数据循环打印...
				g = new Goddess();
				g.setUser_name(rs.getString("user_name"));
				g.setAge(rs.getInt("age"));
				gs.add(g);
				//System.out.println("我的姓名叫"+ rs.getString("user_name") + ",年龄是"+rs.getInt("age") + "岁，是舅舅帮我添加的信息的！");
			}
			return gs;
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		
		return null;//初始化返回null;
	}
	
}
