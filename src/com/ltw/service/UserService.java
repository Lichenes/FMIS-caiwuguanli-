package com.ltw.service;

import com.ltw.pojo.User;

public interface UserService {
	/*
	 * У���û���¼
	 * @param username �û���
	 * @param password ����
	 * return ���ز�ѯ�����û���Ϣ
	 */
	User checkUserLoginService(String username,String password);
	
}