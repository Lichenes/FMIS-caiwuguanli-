package com.ltw.service;

import com.ltw.pojo.User;

public interface UserService {
	/**
	 * 校验用户登录
	 * @param username 用户名
	 * @param password 密码
	 * return 返回查询到的用户信息
	 */
	User checkUserLoginService(String username,String password);
	/**
	 * 修改用户密码
	 * @param newPwd
	 * @param uid
	 * @return
	 */
	int userChangePwdService(String newPwd, int uid);
	/**
	 * 注册用户
	 * @param u
	 * @return
	 */
	int userReisgterService(String uname, String password);
		
}
