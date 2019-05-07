package com.ltw.service;

import com.ltw.pojo.User;

public interface UserService {
	/*
	 * 校验用户登录
	 * @param username 用户名
	 * @param password 密码
	 * return 返回查询到的用户信息
	 */
	User checkUserLoginService(String username,String password);
	
}
