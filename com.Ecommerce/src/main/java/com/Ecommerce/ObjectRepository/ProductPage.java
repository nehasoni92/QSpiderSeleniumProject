package com.Ecommerce.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BaseTest {

	public ProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[text()='Computing and Internet']/../..//input[@value='Add to cart']")
	private WebElement product;

	public WebElement getProduct() {
		return product;
	}

	

	

	

	

}
