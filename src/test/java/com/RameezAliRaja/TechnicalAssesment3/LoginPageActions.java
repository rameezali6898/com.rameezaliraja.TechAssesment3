package com.RameezAliRaja.TechnicalAssesment3;

import org.openqa.selenium.support.PageFactory;

public class LoginPageActions {

	LoginPageLocators loginPageLocators;
	 
	public LoginPageActions() {
		loginPageLocators = new LoginPageLocators();
		
		PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
		}
	
		public void loginOption() {
			loginPageLocators.loginOpt.click();
		}
		
		public void logEmail(String email) {
		loginPageLocators.Email.sendKeys(email);
		}
		
		public void logPass(String password) {
		loginPageLocators.Password.sendKeys(password);
		}
			
		public void rembClick() {
			loginPageLocators.remember.click();
		}
		
		public void clickLogin() {
			loginPageLocators.login.click();
		}
		
		
		
		public void loginInfo(String email, String password) {
			logEmail(email);
			logPass(password);
		}
}
