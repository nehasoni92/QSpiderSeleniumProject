package com.Ecommerce.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.Ecommerce.genericLibrary.BaseClass;

public class RegistrationPage extends BaseTest {

	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement getGender(WebDriver driver, String gender)
	{
		return driver.findElement(By.xpath("//label[text()='"+gender+"']"));
		
	}
	
	@FindBy(id="FirstName")
	private WebElement firstNameTextField;
	
	@FindBy(id="LastName")
	private WebElement lastNameTextField;
	
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPasswordTextField;
	
	@FindBy(id="register-button")
	private WebElement registerButton;
	
	@FindBy(linkText="Log out")
	private WebElement logoutButton;
	
	public void registration(WebDriver driver,String gender, String firstname, String lastname, String email, String password ) throws InterruptedException
	{
		getGender(driver, gender).click();
		firstNameTextField.sendKeys(firstname);
		lastNameTextField.sendKeys(lastname);
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		confirmPasswordTextField.sendKeys(password);
		registerButton.click();
		logoutButton.click();
		
	}

}
