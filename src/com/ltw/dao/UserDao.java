package com.ltw.dao;

import com.ltw.pojo.User;

public interface UserDao {
	/**
	 * 根据用户名和密码查询用户信息
	 * @param username 用户名
	 * @param password 密码
	 * @return 返回查询到的用户信息
	 */
	User checkUserLoginDao(String username,String password);
	/**
	 * 根据用户ID修改用户密码
	 * @param newPwd
	 * @param uid
	 * @return
	 */
	int userChangePwdDao(String newPwd, int uid);
	/**
	 * 用户注册
	 * @param u
	 * @return
	 */
	int userReisgterDao(String uname, String password);
}
