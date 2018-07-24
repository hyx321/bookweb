package com.action;

import com.beans.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.UserService;

public class UserAction  extends ActionSupport implements ModelDriven<User> {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user = new User();
	private UserService userService;
	
	public void setUserService(UserService userService){
		this.userService=userService;
	}
	public String login(){
		
		if(userService.login(user))
			return "success";
		else
			return "fail";
	}
	
	public User getModel() {
		return user;
	}

}
