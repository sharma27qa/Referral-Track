package com.login;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserLoginTest {
@Test
public void test_login() {
	UserLogin login= new UserLogin();
	Assert.assertEquals(0, login.Login ("anjali.sharma@nutekds.com", "1234"));
	}

@Test
public void test_login2() {
	UserLogin login= new UserLogin();
	Assert.assertEquals(1, login.Login ("anjali.sharma@nutekds.com", "123456"));
	}







}
