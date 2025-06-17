package com.Ecommerce.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BaseTest {
	
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	

	@FindBy(id = "termsofservice")
	private WebElement termsServicesCheckBox;

	@FindBy(id = "checkout")
	private WebElement checkOutButton;

	public WebElement getTermsServicesCheckBox() {
		return termsServicesCheckBox;
	}

	public WebElement getCheckOutButton() {
		return checkOutButton;
	}

}
