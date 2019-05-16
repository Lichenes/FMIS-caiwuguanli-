package com.ltw.service;

import com.ltw.pojo.User;

public interface AccountService {
	
	int userAdd(String uname, String name, String id, int money, int age, String sex);

	User userGetMessage(String uname);

	int userIcome(String name, String income, int money, String date, String notebook);

	int userIcrease(int rmb, String uname);

	int userDecrease(int rmb, String uname);

	int userConsume(String name, String consume, int money, String date, String notebook);

	User userCheckMoney(String uname);


}
