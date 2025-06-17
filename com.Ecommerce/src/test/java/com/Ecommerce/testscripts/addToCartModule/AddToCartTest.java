package com.Ecommerce.testscripts.addToCartModule;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Ecommerce.ObjectRepository.CheckoutPage;
import com.Ecommerce.ObjectRepository.LoginPage;
import com.Ecommerce.ObjectRepository.ProductPage;
import com.Ecommerce.ObjectRepository.ShoppingCartPage;
import com.Ecommerce.ObjectRepository.WelcomePage;
import com.Ecommerce.genericLibrary.BaseClass;

public class AddToCartTest extends BaseClass {
	
	@Test (groups = {"FT","RT"})
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

	
	
	@Test(priority=2)
	public void addToCart() throws InterruptedException
	{

	WelcomePage wp = new WelcomePage(driver);
	wp.getBooksLink().click();
	
	Thread.sleep(2000);
	ProductPage pp = new ProductPage(driver);
	pp.getProduct().click();
	
	wp.getShoppingCart().click();
	
	
	
	ShoppingCartPage scp = new ShoppingCartPage(driver);
	
	scp.getTermsServicesCheckBox().click();
	
	scp.getCheckOutButton().click();
	
	
	
	
	CheckoutPage cop = new CheckoutPage(driver);
	cop.getOrderDetails();
	Reporter.log("add to cart test script executed successfuly",true);
	
}


}
