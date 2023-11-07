package com.RameezAliRaja.TechnicalAssesment3;

import org.openqa.selenium.support.PageFactory;

public class HomePageActions {

	HomePageLocators homepagelocators;
	
	public HomePageActions(){
		homepagelocators = new HomePageLocators();
		
		PageFactory.initElements(HelperClass.getDriver(), homepagelocators);
	}
	
	public String getVerifyText() {
		return homepagelocators.verfyText.getText();
	}
	
	public String getInvaliText() {
		return homepagelocators.verfyInvalidText.getText();
	}
	
	public String assercheck() {
		return homepagelocators.WhishlistText.getText();
	}
	
    public String VerifyRegistrationError() {
		return homepagelocators.HomePageError.getText();
	}
}
