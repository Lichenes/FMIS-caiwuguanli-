package com.ltw.service.impl;

import com.ltw.dao.impl.UserDaoImpl;
import com.ltw.pojo.User;
import com.ltw.service.UserService;

public class UserSeerviceImpl implements UserService{
	//声明Dao层对象
	UserDaoImpl ud=new UserDaoImpl();
	//用户登录
	@Override
	public User checkUserLoginService(String username, String password) {
		User u=ud.checkUserLoginDao(username, password);
		return u;
	}
	
}
