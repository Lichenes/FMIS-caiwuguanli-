package com.ltw.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ltw.dao.UserDao;
import com.ltw.pojo.User;

public class UserDaoImpl implements UserDao{
	//�����û����������ѯ�û���Ϣ
	@Override
	public User checkUserLoginDao(String username, String password) {
		//����jdbc����
		Connection conn=null;  //���ݿ����ӽӿ�
		PreparedStatement ps=null;  //ִ�ж�̬sql���ӿ�
		ResultSet rs=null; //���ʽ�����ӿ�
		//��������
		User u=null;
		try {
			String url="jdbc:mysql://localhost:3306/database?serverTimezone=UTC&useSSL=false";
	  		String user="root";
	  		String pwd="root";
	  		//��������
	  		Class.forName("com.mysql.cj.jdbc.Driver");
	  		//��ȡ����.
	  		conn=DriverManager.getConnection(url, user, pwd);
	  		//����sql����
	  		String sql="select * from t_user where username=? and password=?";
	  		//����sql�������
	  		ps=conn.prepareStatement(sql);
	  		//��ռλ����ֵ
	  		ps.setString(1, username);
	  		ps.setString(2, password);
	  		//ִ��sql
	  		rs=ps.executeQuery();
	  		//�������
	  		while(rs.next()){
	  			//��������ֵ
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
			//�ر���Դ
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
		//���ؽ��
		return u;
	}
	//�����û����޸��û�����
	@Override
	public int userChangePwdDao(String newPwd, String uname) {
		//����jdbc����
		Connection conn=null;  //���ݿ����ӽӿ�
		PreparedStatement ps=null;  //ִ�ж�̬sql���ӿ�
		//��������
		int log=0;
  		try {
  			String url="jdbc:mysql://localhost:3306/database?serverTimezone=UTC&useSSL=false";
  			String user="root";
  			String pwd="root";
  		//��������
			Class.forName("com.mysql.cj.jdbc.Driver");
			//��ȡ����
	  		conn=DriverManager.getConnection(url, user, pwd);
	  		//����sql����
	  		String sql="update t_user set password=? where username=?";
	  		//����sql�������
	  		ps=conn.prepareStatement(sql);
	  		//��ռλ����ֵ
	  		ps.setString(1, newPwd);
	  		ps.setString(2, uname);
	  		//ִ��
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
	//�û�ע��
	@Override
	public int userReisgterDao(String uname, String password) {
		//����jdbc����
				Connection conn=null; //���ݿ����ӽӿ�
				PreparedStatement ps=null; //ִ�ж�̬sql���ӿ�
				//��������
				int reg=-1;
		  		try {
		  			String url="jdbc:mysql://localhost:3306/database?serverTimezone=UTC&useSSL=false";
		  	  		String user="root";
		  	  		String pwd="root";
		  	  		//��������
					Class.forName("com.mysql.cj.jdbc.Driver");
					//��ȡ����
					conn=DriverManager.getConnection(url, user, pwd);
					//����sql����
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
		  		//���ؽ��
				return reg;
			}
	}


	
