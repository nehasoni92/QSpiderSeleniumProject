package com.Ecommerce.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BaseTest {

	public WelcomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText="Register")
	private WebElement registerLink;
	
	@FindBy(linkText="Log in")
	private WebElement loginLink;
	
	@FindBy(xpath="//img[@alt='Tricentis Demo Web Shop']")
	private WebElement demoLogo;

	
	public WebElement getDemoLogo() {
		return demoLogo;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Books')]")
	private WebElement booksLink;
	

	public WebElement getBooksLink() {
		return booksLink;
	}

	
	public void setDemoLogo(WebElement demoLogo) {
		this.demoLogo = demoLogo;
	}

	public WebElement getRegisterLink()
	{
		return registerLink;
		
	}
	
	public WebElement getLoginLink()
	{
		return loginLink;
		
	}
	
	@FindBy(linkText = "Shopping cart")
	private WebElement shoppingCart;

	public WebElement getShoppingCart() {
		return shoppingCart;
	}

	
}
