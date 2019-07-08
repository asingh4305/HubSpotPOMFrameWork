package com.qa.hubspot.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.hubspot.pages.BasePage;
import com.qa.hubspot.pages.LoginPage;
import com.qa.hubspot.util.Constants;
import com.qa.hubspot.util.TimeUtil;

public class LoginPageTest {

	WebDriver driver;
	BasePage basePage;
	Properties prop;
	LoginPage loginPage;

	@BeforeMethod
	public void setup() {
		basePage = new BasePage();
		prop = basePage.init_prop();
		driver = basePage.init_driver(prop);
		driver.get(prop.getProperty("url"));
		loginPage = new LoginPage(driver);
		TimeUtil.meduimWait();
		;

	}

	@Test(priority = 1)
	public void verifyLoginPageTitleTest() {
		String title = loginPage.getLoginPageTitle();
		System.out.println("The title f the Login page is : " + title);

		// HubSpot Login is a harcoded value to replace this LOGIN_PAGE_TITLE was called
		// from Constants.java class.
		// Assert.assertEquals(title, "HubSpot Login");
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);
	}

	@Test(priority = 2)
	public void verifySignupLinkTest() {
		Assert.assertTrue(loginPage.verifySignUpLink());

	}

	@Test(priority = 3)
	// do login test case
	public void hubSpotLogin() {
		loginPage.doLogIn(prop.getProperty("username").trim(), prop.getProperty("Test@123").trim());

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
