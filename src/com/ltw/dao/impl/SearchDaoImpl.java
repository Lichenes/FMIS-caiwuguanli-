package com.ltw.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ltw.dao.SearchDao;
import com.ltw.pojo.User;

public class SearchDaoImpl implements SearchDao{

	@Override
	public List<User> uerCheckIncomeDao() {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<User> lu=null;
  		try {
  			String url="jdbc:mysql://localhost:3306/database?serverTimezone=UTC&useSSL=false";
  			String user="root";
  			String pwd="root";
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(url, user, pwd);
			String sql="select * from t_income";
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			lu=new ArrayList<User>();
			while(rs.next()){
				User u=new User();
				u.setName(rs.getString("name"));
				u.setType(rs.getString("type"));
				u.setIncome(rs.getInt("income"));
				u.setDate(rs.getString("date"));
				u.setNotebook(rs.getString("notebook"));
				lu.add(u);   //将对象存储到集合中
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
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
  		
		return lu;
	}

	@Override
	public List<User> uerCheckConsumeDao() {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<User> lu=null;
  		try {
  			String url="jdbc:mysql://localhost:3306/database?serverTimezone=UTC&useSSL=false";
  			String user="root";
  			String pwd="root";
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(url, user, pwd);
			String sql="select * from t_consume";
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			lu=new ArrayList<User>();
			while(rs.next()){
				User u=new User();
				u.setName(rs.getString("name"));
				u.setType(rs.getString("type"));
				u.setConsume(rs.getInt("consume"));
				u.setDate(rs.getString("date"));
				u.setNotebook(rs.getString("notebook"));
				lu.add(u);   
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
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
		return lu;
	}

}
