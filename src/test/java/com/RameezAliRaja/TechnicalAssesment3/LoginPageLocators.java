package com.RameezAliRaja.TechnicalAssesment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {

	@FindBy(xpath = "//a[@class='ico-login']") public WebElement loginOpt;
	
	@FindBy(xpath="//input[@id='Email']") public WebElement Email;
	
	@FindBy(xpath="//input[@id='Password']") public WebElement Password;
	
	@FindBy(xpath="//input[@id='RememberMe']") public WebElement remember;
	
	@FindBy(xpath="//input[@value='Log in']") public WebElement login;


}
