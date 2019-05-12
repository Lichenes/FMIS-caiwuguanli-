package com.ltw.dao;

public interface AccountDao {
	int userAdd(String uname, String id, int money);
	int userAdd2(String uname, String sex, int age);
}
