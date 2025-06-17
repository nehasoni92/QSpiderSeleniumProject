package com.Ecommerce.genericLibrary;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.WebDriver;

public class DataUtility {
	
	public void implicitWait(WebDriver driver, int seconds)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	public static int getRandomNo() {
		Random r = new Random();
		return r.nextInt(10000);
	}

	public String getRandomEmail() {
		String email = "deepakkumar" + getRandomNo() + "@gmail.com";
		return email;
	}

}
