package com.Ecommerce.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BaseTest {
	
	public CheckoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@onclick='Billing.save()']")
	private WebElement billingAddressContinue;

	
	@FindBy(xpath="//input[@onclick='Shipping.save()']")
	private WebElement shippingAddressContinue;

		
	@FindBy(xpath="//input[@onclick='ShippingMethod.save()']")
	private WebElement shippingMethodContinue;

		
	@FindBy(xpath="//input[@onclick='PaymentMethod.save()']")
	private WebElement paymentMethodContinue;

		
	@FindBy(xpath="//input[@onclick='PaymentInfo.save()']")
	private WebElement paymentInformationContinue;

		
	@FindBy(xpath="//input[@onclick='ConfirmOrder.save()']")
	private WebElement confirmOrder;

		
	@FindBy(xpath="//a[contains(text(),'Click here for order details.')]")
	private WebElement orderDetails;

	
	@FindBy(xpath = "//a[text()='PDF Invoice']")
	private WebElement pdfInvoiceButton;
	
	public void getOrderDetails()
	{
		billingAddressContinue.click();
		shippingAddressContinue.click();
		shippingMethodContinue.click();
		paymentMethodContinue.click();
		paymentInformationContinue.click();
		confirmOrder.click();
		orderDetails.click();
		pdfInvoiceButton.click();
	}
	
	
	

}
