package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.hubspot.util.ElementActions;

import io.qameta.allure.Step;

public class LoginPageBy extends BasePage  {
	ElementActions elementActions;
	//DriverUtil driverUtil;
	WebDriver driver;
	
	//Non Page factory pattern
	//By Locators:
	By emailID = By.id("username");
	By password = By.id("password");
	By loginButton = By.id("loginBtn");  
	By SignUpLink = By.linkText("Sign Up");
	

	
	public LoginPageBy(WebDriver driver) {
		this.driver=driver;
		elementActions = new ElementActions(driver); 
		
	}
	
	//PageActions:
	//define page actions/methods:
	@Step("getting login page title step...")
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	@Step("Checking Signup link is displayed with is displayed method step...")
	public boolean verifySignUpLink() {
		return elementActions.getElement(SignUpLink).isDisplayed();
	}
	 
	@Step("login in to app with username: {0} and password: {1}")
	public HomePage doLogIn(String username, String pwd  ) {
		elementActions.getElement(emailID).sendKeys(username);
		elementActions.getElement(password).sendKeys(pwd);
		elementActions.getElement(loginButton).click();
		
		return new HomePage(driver);
	
	}
}