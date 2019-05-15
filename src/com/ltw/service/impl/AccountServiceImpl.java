package com.ltw.service.impl;

import com.ltw.dao.AccountDao;
import com.ltw.dao.impl.AccountDaoImpl;
import com.ltw.pojo.User;
import com.ltw.service.AccountService;

public class AccountServiceImpl implements  AccountService{
	AccountDao ad=new AccountDaoImpl();

	@Override
	public int userAdd(String uname, String name, String id, int money, int age, String sex) {
		// TODO Auto-generated method stub
		return ad.userAdd(uname,name,id,money,age,sex);
	}

	@Override
	public User userGetMessage(String uname) {
		// TODO Auto-generated method stub
		return ad.UserGetMessageDao(uname);
	}

	@Override
	public int userIcome(String name, String income, int money, String date, String notebook) {
		// TODO Auto-generated method stub
		return ad.userIcomeDao(name,income,money,date,notebook);
	}

	@Override
	public int userIcrease(int rmb, String uname) {
		// TODO Auto-generated method stub
		return ad.uerIcrease(rmb,uname);
	}

}
