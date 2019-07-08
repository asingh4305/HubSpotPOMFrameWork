package com.qa.hubspot.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.hubspot.pages.BasePage;
import com.qa.hubspot.pages.HomePage;
import com.qa.hubspot.pages.LoginPage;
import com.qa.hubspot.util.Constants;
import com.qa.hubspot.util.TimeUtil;

public class HomePageTest {

	WebDriver driver;
	BasePage basePage;
	Properties prop;
	LoginPage loginPage;
	HomePage homePage;
	
	@BeforeMethod
	public void setup() {
		basePage = new BasePage();
		prop = basePage.init_prop();
		driver = basePage.init_driver(prop);
		driver.get(prop.getProperty("url"));
		loginPage = new LoginPage(driver);
		TimeUtil.meduimWait();
		
		homePage = loginPage.doLogIn(prop.getProperty("username"), prop.getProperty("password"));

	}

	
	@Test(priority = 1)
	public void verifyHomePageTitle() {
		String title = homePage.getHomePageTitle();
		System.out.println("home page title is: " + title);
		Assert.assertEquals(title, Constants.HOME_PAGE_TITLE);
	}
	
	
	@Test(priority = 2)
	public void verifyHomePageHeader() {
		String headerValue = homePage.getHomePageHeaderValue();
		System.out.println("Home Page Header is: " + headerValue);
		
		Assert.assertEquals(headerValue, Constants.HOME_PAGE_HEADER);
	}
	
	
	@Test(priority = 3)
	public void verifyLoggedInUserAccountNameTest() {
		String accountName = homePage.getLoggedInAccountValue();
		System.out.println("Logged n user account Name is: " + accountName);
		Assert.assertEquals(accountName, prop.getProperty("accountname"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

	
	
	
	
	
	

}
