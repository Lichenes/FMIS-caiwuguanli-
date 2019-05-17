package com.ltw.service.impl;

import java.util.List;

import com.ltw.dao.SearchDao;
import com.ltw.dao.impl.SearchDaoImpl;
import com.ltw.pojo.User;
import com.ltw.service.SearchService;

public class SearchServiceImpl implements SearchService{
	SearchDao sd=new SearchDaoImpl();
	@Override
	public List<User> userCheckIncomeService() {
		
		return sd.uerCheckIncomeDao();
	}

}
