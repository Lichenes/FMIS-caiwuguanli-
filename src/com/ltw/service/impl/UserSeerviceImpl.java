package com.ltw.service.impl;

import com.ltw.dao.impl.UserDaoImpl;
import com.ltw.pojo.User;
import com.ltw.service.UserService;

public class UserSeerviceImpl implements UserService{
	//����Dao�����
	UserDaoImpl ud=new UserDaoImpl();
	//�û���¼
	@Override
	public User checkUserLoginService(String username, String password) {
		User u=ud.checkUserLoginDao(username, password);
		return u;
	}
	
}
