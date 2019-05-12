package com.ltw.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ltw.dao.UserDao;
import com.ltw.pojo.User;

public class UserDaoImpl implements UserDao{
	//根据用户名和密码查询用户信息
	@Override
	public User checkUserLoginDao(String username, String password) {
		//声明jdbc对象
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
	  		String sql="select * from t_user where username=? and password=?";
	  		//创建sql命令对象
	  		ps=conn.prepareStatement(sql);
	  		//给占位符赋值
	  		ps.setString(1, username);
	  		ps.setString(2, password);
	  		//执行sql
	  		rs=ps.executeQuery();
	  		//遍历结果
	  		while(rs.next()){
	  			//给变量赋值
	  			u=new User();
	  			u.setUsername(rs.getString("username"));
	  			u.setPassword(rs.getString("password"));
	  			u.setSex(rs.getString("sex"));
	  			u.setAge(rs.getInt("age"));
	  			u.setBrith(rs.getString("birth"));
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
	//根据用户名修改用户密码
	@Override
	public int userChangePwdDao(String newPwd, String uname) {
		//声明jdbc对象
		Connection conn=null;  //数据库连接接口
		PreparedStatement ps=null;  //执行动态sql语句接口
		//创建变量
		int log=0;
  		try {
  			String url="jdbc:mysql://localhost:3306/database?serverTimezone=UTC&useSSL=false";
  			String user="root";
  			String pwd="root";
  		//加载驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			//获取连接
	  		conn=DriverManager.getConnection(url, user, pwd);
	  		//创建sql命令
	  		String sql="update t_user set password=? where username=?";
	  		//创建sql命令对象
	  		ps=conn.prepareStatement(sql);
	  		//给占位符赋值
	  		ps.setString(1, newPwd);
	  		ps.setString(2, uname);
	  		//执行
	  		log=ps.executeUpdate();
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
		return log;
	}	
	//用户注册
	@Override
	public int userReisgterDao(String uname, String password) {
		//声明jdbc对象
				Connection conn=null; //数据库连接接口
				PreparedStatement ps=null; //执行动态sql语句接口
				//创建变量
				int reg=-1;
		  		try {
		  			String url="jdbc:mysql://localhost:3306/database?serverTimezone=UTC&useSSL=false";
		  	  		String user="root";
		  	  		String pwd="root";
		  	  		//加载驱动
					Class.forName("com.mysql.cj.jdbc.Driver");
					//获取连接
					conn=DriverManager.getConnection(url, user, pwd);
					//创建sql命令
					String sql = "INSERT INTO t_user(username,password,sex) VALUES(?,?,1)";
					ps = conn.prepareStatement(sql);
					ps.setString(1, uname);
					ps.setString(2,password);
					reg=ps.executeUpdate();
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
		  		//返回结果
				return reg;
			}
	}


	
