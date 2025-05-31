package com.Ecommerce.testscripts.registerModule;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Ecommerce.ObjectRepository.RegistrationPage;
import com.Ecommerce.ObjectRepository.WelcomePage;
import com.Ecommerce.genericLibrary.BaseClass;
import com.Ecommerce.genericLibrary.ExcelUtility;

public class RegisterTest extends BaseClass {
	
	@DataProvider(name="TestData")
	public Object[][] registerData() throws EncryptedDocumentException, IOException
	{
		return ExcelUtility.readExcel(EXCEL_PATH, SHEET_NAME);
		
	}
		
		@Test(dataProvider="TestData")
		public void register(String gender, String firstName, String lastName, String email, String password) throws InterruptedException
		{
			WelcomePage wp = new WelcomePage(driver);
			wp.getRegisterLink().click();
			RegistrationPage rp=new RegistrationPage(driver);
			rp.registration(driver, gender, firstName,lastName,email, password );
		}

}
