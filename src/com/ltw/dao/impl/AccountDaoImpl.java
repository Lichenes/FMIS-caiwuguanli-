package com.ltw.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ltw.dao.AccountDao;
import com.ltw.pojo.User;

public class AccountDaoImpl implements AccountDao{

	@Override
	public int userAdd(String uname, String name, String id, int money, int age, String sex) {
		Connection conn=null;
		PreparedStatement ps=null;
		int inf=0;
		try {
			String url="jdbc:mysql://localhost:3306/database?serverTimezone=UTC&useSSL=false";
	  		String user="root";
	  		String pwd="root";
	  		//加载驱动
	  		Class.forName("com.mysql.cj.jdbc.Driver");
	  		//获取连接.
	  		conn=DriverManager.getConnection(url, user, pwd);
	  		//创建sql命令
	  		String sql="insert into t_account values(?,?,?,?,?,?)";
	  		//创建sql命令对象
	  		ps=conn.prepareStatement(sql);
	  		//给占位符赋值
	  		ps.setString(1, uname);
	  		ps.setString(2, name);
	  		ps.setString(3, id);
	  		ps.setInt(4, money);
	  		ps.setInt(5, age);
	  		ps.setString(6, sex);
	  		//执行sql
	  		inf=ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//关闭资源
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
		return inf;
	}

	@Override
	public User UserGetMessageDao(String uname) {
		Connection conn=null;  //数据库连接接口
		PreparedStatement ps=null;  //执行动态sql语句接口
		ResultSet rs=null; //访问结果集接口
		//声明变量
		User u=null;
		try {
			String url="jdbc:mysql://localhost:3306/database?serverTimezone=UTC&useSSL=false";
	  		String user="root";
	  		String pwd="root";
	  		//加载驱动
	  		Class.forName("com.mysql.cj.jdbc.Driver");
	  		//获取连接.
	  		conn=DriverManager.getConnection(url, user, pwd);
	  		//创建sql命令
	  		String sql="select * from t_account where username=?";
	  		//创建sql命令对象
	  		ps=conn.prepareStatement(sql);
	  		//给占位符赋值
	  		ps.setString(1, uname);
	  		//执行sql
	  		rs=ps.executeQuery();
	  		//遍历结果
	  		while(rs.next()){
	  			//给变量赋值
	  			u=new User();
	  			u.setUsername(rs.getString("username"));
	  			u.setName(rs.getString("name"));
	  			u.setCardid(rs.getString("cardid"));
	  			u.setMoney(rs.getInt("money"));
	  			u.setAge(rs.getInt("age"));
	  			u.setSex(rs.getString("sex"));
	  		}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//关闭资源
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
		//返回结果
		return u;
	}

	@Override
	public int userIcomeDao(String name, String income, int money, String date, String notebook) {
		Connection conn=null;
		PreparedStatement ps=null;
		int index=0;
		try {
			String url="jdbc:mysql://localhost:3306/database?serverTimezone=UTC&useSSL=false";
	  		String user="root";
	  		String pwd="root";
	  		Class.forName("com.mysql.cj.jdbc.Driver");
	  		conn=DriverManager.getConnection(url, user, pwd);
	  		String sql="insert into t_income values(default,?,?,?,?,?)";
	  		ps=conn.prepareStatement(sql);
	  		ps.setString(1, name);
	  		ps.setString(2, income);
	  		ps.setInt(3, money);
	  		ps.setString(4, date);
	  		ps.setString(5, notebook);
	  		index=ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
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
		return index;
	}

	@Override
	public int uerIcrease(int rmb, String uname) {
		Connection conn=null; 
		PreparedStatement ps=null;  
		int index=0;
  		try {
  			String url="jdbc:mysql://localhost:3306/database?serverTimezone=UTC&useSSL=false";
  			String user="root";
  			String pwd="root";
			Class.forName("com.mysql.cj.jdbc.Driver");
	  		conn=DriverManager.getConnection(url, user, pwd);
	  		String sql="update t_account set money=money+? where username=?";
	  		ps=conn.prepareStatement(sql);
	  		ps.setInt(1, rmb);
	  		ps.setString(2, uname);
	  		index=ps.executeUpdate();
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
		return index;
	}

	@Override
	public int useDecreaseDao(int rmb, String uname) {
		Connection conn=null; 
		PreparedStatement ps=null;  
		int index=0;
  		try {
  			String url="jdbc:mysql://localhost:3306/database?serverTimezone=UTC&useSSL=false";
  			String user="root";
  			String pwd="root";
			Class.forName("com.mysql.cj.jdbc.Driver");
	  		conn=DriverManager.getConnection(url, user, pwd);
	  		String sql="update t_account set money=money-? where username=?";
	  		ps=conn.prepareStatement(sql);
	  		ps.setInt(1, rmb);
	  		ps.setString(2, uname);
	  		index=ps.executeUpdate();
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
		return index;
	}

	@Override
	public int userConsume(String name, String consume, int money, String date, String notebook) {
		Connection conn=null;
		PreparedStatement ps=null;
		int index=0;
		try {
			String url="jdbc:mysql://localhost:3306/database?serverTimezone=UTC&useSSL=false";
	  		String user="root";
	  		String pwd="root";
	  		Class.forName("com.mysql.cj.jdbc.Driver");
	  		conn=DriverManager.getConnection(url, user, pwd);
	  		String sql="insert into t_consume values(default,?,?,?,?,?)";
	  		ps=conn.prepareStatement(sql);
	  		ps.setString(1, name);
	  		ps.setString(2, consume);
	  		ps.setInt(3, money);
	  		ps.setString(4, date);
	  		ps.setString(5, notebook);
	  		index=ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
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
		return index;
	}

}