package com.daoImp;
import java.util.List;


import com.beans.User;
import com.dao.UserDao;
import com.opensymphony.xwork2.ActionContext;

public class UserDaoImp extends org.springframework.orm.hibernate5.HibernateTemplate implements UserDao{

	public boolean check(User user) {
		
		boolean result;
		
		List userInfo= this.find("from User where name=? and passwd=?",user.getName(),user.getPasswd());
		
		if(userInfo.isEmpty()){	
			result=false;
		}
		else{
			user = (User)userInfo.get(0);
			
			ActionContext.getContext().getSession().put("user", user);
			result = true;
		}
			
		return result;
	}
	

}
