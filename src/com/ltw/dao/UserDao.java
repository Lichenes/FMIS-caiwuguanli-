package com.ltw.dao;

import com.ltw.pojo.User;

public interface UserDao {
	/**
	 * �����û����������ѯ�û���Ϣ
	 * @param username �û���
	 * @param password ����
	 * @return ���ز�ѯ�����û���Ϣ
	 */
	User checkUserLoginDao(String username,String password);
}
