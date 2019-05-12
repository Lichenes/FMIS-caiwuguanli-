package com.ltw.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ltw.dao.AccountDao;

public class AccountDaoImpl implements AccountDao{

	@Override
	public int userAdd(String uname, String id, int money) {
		Connection conn=null;  //数据库连接接口
		PreparedStatement ps=null;  //执行动态sql语句接口
		int Ifm=0;
  		try {
  			String url="jdbc:mysql://localhost:3306/database?serverTimezone=UTC&useSSL=false";
  			String user="root";
  			String pwd="root";
  		//加载驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			//获取连接
	  		conn=DriverManager.getConnection(url, user, pwd);
	  		//创建sql命令
	  		String sql="INSERT INTO t_account(username,cardid,money) VALUES(?,?,?)";
	  		//创建sql命令对象
	  		ps=conn.prepareStatement(sql);
	  		//给占位符赋值
	  		ps.setString(1, uname);
	  		ps.setString(2, id);
	  		ps.setInt(3, money);
	  		//执行
	  		Ifm=ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return Ifm;
	}

	@Override
	public int userAdd2(String uname, String sex, int age) {
		Connection conn=null;  //数据库连接接口
		PreparedStatement ps=null;  //执行动态sql语句接口
		int Ifm=0;
  		try {
  			String url="jdbc:mysql://localhost:3306/database?serverTimezone=UTC&useSSL=false";
  			String user="root";
  			String pwd="root";
  		//加载驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			//获取连接
	  		conn=DriverManager.getConnection(url, user, pwd);
	  		//创建sql命令
	  		String sql="update t_user set sex=? , age=? where username=?";
	  		//创建sql命令对象
	  		ps=conn.prepareStatement(sql);
	  		//给占位符赋值
	  		ps.setString(1, sex);
	  		ps.setInt(2, age);
	  		ps.setString(3, uname);
	  		//执行
	  		Ifm=ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return Ifm;
	}


}
