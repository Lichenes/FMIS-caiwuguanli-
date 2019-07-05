package com.ltw.dao;

import java.util.List;

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
	 * @param uname
	 * @param name
	 * @param income
	 * @param money
	 * @param date
	 * @param notebook
	 * @return
	 */
	int userIcomeDao(String uname, String name, String income, int money, String date, String notebook);
	/**
	 * 
	 * @param rmb
	 * @param uname
	 * @return
	 */
	int uerIcrease(int rmb, String uname);
	/**
	 * 
	 * @param rmb
	 * @param uname
	 * @return
	 */
	int useDecreaseDao(int rmb, String uname);
	/**
	 * 
	 * @param uname
	 * @param name
	 * @param consume
	 * @param money
	 * @param date
	 * @param notebook
	 * @return
	 */
	int userConsume(String uname, String name, String consume, int money, String date, String notebook);
	/**
	 * 
	 * @param uname
	 * @return
	 */
	User userCheckMoneyDao(String uname);
	List<User> uerCheckIncomeDao();
	List<User> uerCheckConsumeDao();

}
