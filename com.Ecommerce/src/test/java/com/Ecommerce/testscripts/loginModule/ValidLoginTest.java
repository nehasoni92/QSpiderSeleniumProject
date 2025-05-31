package com.Ecommerce.testscripts.loginModule;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Ecommerce.ObjectRepository.LoginPage;
import com.Ecommerce.ObjectRepository.WelcomePage;
import com.Ecommerce.genericLibrary.BaseClass;

public class ValidLoginTest extends BaseClass{
	
	@Test
	public void login()
	{
		WelcomePage wp = new WelcomePage(driver);
		//Hard Assert
		Assert.assertEquals(wp.getDemoLogo().isDisplayed(), true);
		wp.getLoginLink().click();
		LoginPage lp = new LoginPage(driver);
		lp.loginFunctionality("login12@gmail.com", "12345678");
		//SoftAssert
		SoftAssert s = new SoftAssert();
		s.assertEquals(lp.getLogoutLink().isDisplayed(), true);
		s.assertAll();
		
		
	}

}
