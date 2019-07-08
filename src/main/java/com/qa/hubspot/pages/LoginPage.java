package com.qa.hubspot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  extends BasePage {
	WebDriver driver;
	//1. define your page object
	//2. define page actions/methods
	
	// page objects: with page factory & without page factory;
	
	// With Page Factory
	
	@FindBy(id = "username")
	WebElement emailId;
	
	
	@FindBy(id="password")
	WebElement password;
	
	
	@FindBy(id="loginBtn")
	WebElement loginButton;
	
	@FindBy(linkText="Sign Up")
	WebElement SignUpLink;
	
	//Create the constructor of this page class:
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//define page actions/methods:
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifySignUpLink() {
		return SignUpLink.isDisplayed();
	}
	
	
	// instead of void we have used HomePage because once the login will be successful it will return HomePage class. 
	public HomePage doLogIn(String username, String pwd  ) {
		emailId.sendKeys(username);
		password.sendKeys(pwd);
		loginButton.click();
			
		return new HomePage(driver);
		
		
		
			
	}


	
	
	
	
	
	
	
	
	
	
	

}
