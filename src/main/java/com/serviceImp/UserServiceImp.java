package com.serviceImp;

import com.beans.User;
import com.dao.UserDao;
import com.service.UserService;

public class UserServiceImp implements UserService {
	
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao){
		this.userDao=userDao;
	}
	
	//ÅÐ¶ÏµÇÂ¼Çé¿ö
	public boolean login(User user) {
	
		boolean ret=userDao.check(user);
		if(ret){
			return true;
		}
		return false;
	}

	
}