package com.RameezAliRaja.TechnicalAssesment3;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	UtilityClass data = new UtilityClass();
	LoginPageActions objLogin = new LoginPageActions();
	HomePageActions objHome = new HomePageActions();
	
	@Given("User is on DemoWebShop Home page")
	public void user_is_on_demo_web_shop_home_page() {
		HelperClass.openPage(data.Url);
	    System.out.println("login page");	
	}

	@When("User clicks Login")
	public void user_clicks_login() {
		objLogin.loginOption();
		System.out.println("Loggin Page");
	}

	@When("User enters valid Email and Password")
	public void user_enters_valid_email_and_password() {
		objLogin.loginInfo(data.EMail, data.Pass);
		   System.out.println("Username and password");
	}

	@When("User clicks Remember me")
	public void user_clicks_remember_me() {
		objLogin.rembClick();
		System.out.println("Remember Option Clicked");
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
	   objLogin.clickLogin();
	   System.out.println("Logged In");
	}

	@Then("User should be able to login sucessfully")
	public void user_should_be_able_to_login_sucessfully() {
		Assert.assertTrue(objHome.getVerifyText().contains("exp@gmail.com"));
		System.out.println("login successful");
	}

	@Then("Login will be unsucessful with error message")
	public void login_will_be_unsucessful_with_error_message() {
		Assert.assertTrue(objHome.getInvaliText().contains("Login was unsuccessful. Please correct the errors and try again.\r\n"
				+ "The credentials provided are incorrect"));
		System.out.println("login unsuccessful");

	}

}
