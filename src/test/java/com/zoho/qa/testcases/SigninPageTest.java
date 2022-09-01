package com.zoho.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoho.qa.base.TestBase;
import com.zoho.qa.pages.HomePage;
import com.zoho.qa.pages.LandingPage;
import com.zoho.qa.pages.SigninPage;

public class SigninPageTest extends TestBase{

	HomePage homePage;
	SigninPage signinPage;
	LandingPage landingPage;

	public SigninPageTest(){
		super();
		}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		landingPage = new LandingPage();
		signinPage = new SigninPage();
		signinPage=landingPage.clickOnSigninLink();
	}
	
	
	
	@Test(priority=1)
	public void validateSigninPageTitleTest(){
		String title = signinPage.validateSigninPageTitle();
		Assert.assertEquals(title, "Zoho Accounts");
	}
	
	@Test(priority=2)
	public void validatesignupimgTest(){
		boolean flag = signinPage.validatesignupimg();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest(){
		homePage = signinPage.login(prop.getProperty("Email_address"), prop.getProperty("password"));
	}
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
}
