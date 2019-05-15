package com.ltw.dao;

import com.ltw.pojo.User;

public interface AccountDao {
	/**
	 * 
	 * @param uname
	 * @param name
	 * @param id
	 * @param money
	 * @param age
	 * @param sex
	 * @return
	 */
	int userAdd(String uname, String name, String id, int money, int age, String sex);
	/**
	 * 
	 * @param uname
	 * @return
	 */
	User UserGetMessageDao(String uname);
	/**
	 * 
	 * @param name
	 * @param income
	 * @param money
	 * @param date
	 * @param notebook
	 * @return
	 */
	int userIcomeDao(String name, String income, int money, String date, String notebook);
	/**
	 * 
	 * @param rmb
	 * @param uname
	 * @return
	 */
	int uerIcrease(int rmb, String uname);


}
