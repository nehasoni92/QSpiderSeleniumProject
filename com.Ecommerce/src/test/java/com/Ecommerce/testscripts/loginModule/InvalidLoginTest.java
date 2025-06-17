package com.Ecommerce.testscripts.loginModule;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Ecommerce.ObjectRepository.BaseTest;
import com.Ecommerce.ObjectRepository.LoginPage;
import com.Ecommerce.ObjectRepository.WelcomePage;
import com.Ecommerce.genericLibrary.BaseClass;
import com.Ecommerce.genericLibrary.ExcelUtility;

public class InvalidLoginTest extends BaseClass {
	
	@DataProvider(name="Login")
	public Object[][] loginData() throws EncryptedDocumentException, IOException
	{
		return ExcelUtility.readExcel(Login_EXCEL_PATH, Login_SHEET_NAME);
		
	}
	
	@Test(dataProvider="Login")
	public void invalidlogin(String username, String password) throws InterruptedException
	{
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		Thread.sleep(2000);
		LoginPage lp = new LoginPage(driver);
		lp.loginFunctionality(username, password);
		
		
	}

}
