package com.login;

import java.util.ResourceBundle;

public class UserLogin {
public int Login(String in_user, String in_pswd) {
	ResourceBundle rb= ResourceBundle.getBundle("config");
	String username =rb.getString("username");
	String password =rb.getString("password");
	if (in_user.equals(username) && in_pswd.equals(password))
		return 1;
	else
		return 0;
}   
}
