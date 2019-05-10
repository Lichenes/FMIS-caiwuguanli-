package com.ltw.service.impl;

import com.ltw.dao.UserDao;
import com.ltw.dao.impl.UserDaoImpl;
import com.ltw.pojo.User;
import com.ltw.service.UserService;

public class UserSeerviceImpl implements UserService{
	//声明Dao层对象
	UserDao ud=new UserDaoImpl();
	//用户登录
	@Override
	public User checkUserLoginService(String username, String password) {
		User u=ud.checkUserLoginDao(username, password);
		return u;
	}
	//修改用户密码
	@Override
	public int userChangePwdService(String newPwd, int uid) {
		int log=ud.userChangePwdDao(newPwd,uid);
		return log;
	}
	//用户注册
	@Override
	public int userReisgterService(String uname, String password) {
		int reg=ud.userReisgterDao(uname,password);
		return reg;
	}
	
}
