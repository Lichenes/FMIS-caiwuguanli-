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
	 * �����û������޸��û�����
	 * @param newPwd
	 * @param uname
	 * @return
	 */
	int userChangePwdDao(String newPwd, String uname);
	/**
	 * �û�ע��
	 * @param u
	 * @return
	 */
	int userReisgterDao(String uname, String password);
}
