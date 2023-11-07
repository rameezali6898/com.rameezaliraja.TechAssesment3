package com.RameezAliRaja.TechnicalAssesment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	
	@FindBy(xpath = "//a[text()='exp@gmail.com']") WebElement verfyText;
	@FindBy(xpath = "//div[@class='validation-summary-errors']") WebElement verfyInvalidText;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div") public WebElement WhishlistText;
	@FindBy(xpath="//li[text()=\"The specified email already exists\"]")
	WebElement HomePageError;
}
