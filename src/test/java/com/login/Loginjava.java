package com.login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asharma\\Desktop\\chromedriver_latest\\chromedriver.exe");
		WebDriver driver= new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("http://win2012r2s2:4200/#/auth/login");
		Login_page login= new Login_page(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
