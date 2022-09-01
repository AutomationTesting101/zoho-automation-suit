package com.zoho.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoho.qa.base.TestBase;

public class SigninPage extends TestBase {

	// Page Factory - OR:
		@FindBy(xpath = "//input[@id='login_id']")
		WebElement Email_address;
		
		@FindBy(xpath = "//form[@id='login']//button[@id='nextbtn']")
		WebElement NextBtn;

		@FindBy(xpath = "//input[@id='password']")
		WebElement password;

		@FindBy(xpath = "//button[@id='nextbtn']//span[contains(text(),'Sign in')]")
		WebElement signinBtn;

		@FindBy(xpath = "//div[@class='overlapBanner']")
		WebElement signupimg;

		// Initializing the Page Objects:
		public SigninPage() {
			PageFactory.initElements(driver, this);
		}

		// Actions:
		public String validateSigninPageTitle() {
			return driver.getTitle();
		}

		public boolean validatesignupimg(){
				return signupimg.isDisplayed();
		}
		
		public HomePage login(String un, String pwd){
			Email_address.sendKeys(un);
			NextBtn.click();
			password.sendKeys(pwd);
			signinBtn.click();
			return new HomePage();
		}
	
	
	
}
