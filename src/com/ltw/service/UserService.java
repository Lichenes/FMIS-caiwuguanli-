package com.ltw.service;

import com.ltw.pojo.User;

public interface UserService {
	/**
	 * У���û���¼
	 * @param username �û���
	 * @param password ����
	 * return ���ز�ѯ�����û���Ϣ
	 */
	User checkUserLoginService(String username,String password);
	/**
	 * �޸��û�����
	 * @param newPwd
	 * @param uname
	 * @return
	 */
	int userChangePwdService(String newPwd, String uname);
	/**
	 * ע���û�
	 * @param u
	 * @return
	 */
	int userReisgterService(String uname, String password);
		
}
