package com.Ecommerce.testscripts.loginModule;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Ecommerce.ObjectRepository.BaseTest;
import com.Ecommerce.ObjectRepository.LoginPage;
import com.Ecommerce.ObjectRepository.WelcomePage;
import com.Ecommerce.genericLibrary.BaseClass;

public class InvalidLoginTest extends BaseClass {
	
	
	@Test
	public void invalidlogin()
	{
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		LoginPage lp = new LoginPage(driver);
		lp.loginFunctionality("neha", "soni");
		
		
	}

}
