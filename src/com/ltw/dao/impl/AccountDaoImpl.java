package com.ltw.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ltw.dao.AccountDao;

public class AccountDaoImpl implements AccountDao{

	@Override
	public int userAdd(String uname, String id, int money) {
		Connection conn=null;  //���ݿ����ӽӿ�
		PreparedStatement ps=null;  //ִ�ж�̬sql���ӿ�
		int Ifm=0;
  		try {
  			String url="jdbc:mysql://localhost:3306/database?serverTimezone=UTC&useSSL=false";
  			String user="root";
  			String pwd="root";
  		//��������
			Class.forName("com.mysql.cj.jdbc.Driver");
			//��ȡ����
	  		conn=DriverManager.getConnection(url, user, pwd);
	  		//����sql����
	  		String sql="INSERT INTO t_account(username,cardid,money) VALUES(?,?,?)";
	  		//����sql�������
	  		ps=conn.prepareStatement(sql);
	  		//��ռλ����ֵ
	  		ps.setString(1, uname);
	  		ps.setString(2, id);
	  		ps.setInt(3, money);
	  		//ִ��
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
		Connection conn=null;  //���ݿ����ӽӿ�
		PreparedStatement ps=null;  //ִ�ж�̬sql���ӿ�
		int Ifm=0;
  		try {
  			String url="jdbc:mysql://localhost:3306/database?serverTimezone=UTC&useSSL=false";
  			String user="root";
  			String pwd="root";
  		//��������
			Class.forName("com.mysql.cj.jdbc.Driver");
			//��ȡ����
	  		conn=DriverManager.getConnection(url, user, pwd);
	  		//����sql����
	  		String sql="update t_user set sex=? , age=? where username=?";
	  		//����sql�������
	  		ps=conn.prepareStatement(sql);
	  		//��ռλ����ֵ
	  		ps.setString(1, sex);
	  		ps.setInt(2, age);
	  		ps.setString(3, uname);
	  		//ִ��
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
