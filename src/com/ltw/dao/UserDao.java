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
	/**
	 * �����û�ID�޸��û�����
	 * @param newPwd
	 * @param uid
	 * @return
	 */
	int userChangePwdDao(String newPwd, int uid);
	/**
	 * �û�ע��
	 * @param u
	 * @return
	 */
	int userReisgterDao(String uname, String password);
}
