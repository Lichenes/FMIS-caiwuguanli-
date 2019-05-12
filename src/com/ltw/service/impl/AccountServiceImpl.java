package com.ltw.service.impl;

import com.ltw.dao.AccountDao;
import com.ltw.dao.impl.AccountDaoImpl;
import com.ltw.service.AccountService;

public class AccountServiceImpl implements  AccountService{
	AccountDao ad=new AccountDaoImpl();

	@Override
	public int userAdd(String uname, String id, int money) {
		return ad.userAdd(uname, id, money);
	}

	@Override
	public int userAdd2(String uname, String sex, int age) {
		// TODO Auto-generated method stub
		return ad.userAdd2(uname, sex, age);
	}

}
