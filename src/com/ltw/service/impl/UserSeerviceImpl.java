package com.ltw.service.impl;

import com.ltw.dao.UserDao;
import com.ltw.dao.impl.UserDaoImpl;
import com.ltw.pojo.User;
import com.ltw.service.UserService;

public class UserSeerviceImpl implements UserService{
	//����Dao�����
	UserDao ud=new UserDaoImpl();
	//�û���¼
	@Override
	public User checkUserLoginService(String username, String password) {
		User u=ud.checkUserLoginDao(username, password);
		return u;
	}
	//�޸��û�����
	@Override
	public int userChangePwdService(String newPwd, int uid) {
		int log=ud.userChangePwdDao(newPwd,uid);
		return log;
	}
	//�û�ע��
	@Override
	public int userReisgterService(String uname, String password) {
		int reg=ud.userReisgterDao(uname,password);
		return reg;
	}
	
}
