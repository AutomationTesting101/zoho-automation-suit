package com.zoho.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.zoho.qa.base.TestBase;

public class LandingPage extends TestBase {



	@FindBy(xpath = "//span[@class='zoho-logo']")
	WebElement zohologo;
	
	@FindBy(xpath = "//span[@xpath='1']")
	WebElement Language;

	@FindBy(xpath = "//a[@class='zh-customers']")
	WebElement CustomersLink;
	
	@FindBy(xpath = "//a[@class='zh-support']")
	WebElement SupportLink;
	
	@FindBy(xpath = "//a[@class='zh-contact']")
	WebElement ContactSalesLink;

	@FindBy(xpath = "//a[@class='zh-login']")
	WebElement SigninLink;

	@FindBy(xpath = "//a[@class='zh-signup']")
	WebElement FreeSignUpLink;

	@FindBy(xpath = "//span[@class='menu-search-icon']")
	WebElement searchLink;
	
	@FindBy(xpath = "//input[@id='hockey_v1-query']")
	WebElement searchboxlink;
	

	@FindBy(xpath = "//a[contains(text(),' Submit a ticket ')]")
	WebElement submitaticket;
	
	@FindBy(xpath = "//span[@data-id='Zoho_CRM_addTicket']")
	WebElement submitrequestbtn;
	
	// Initializing the Page Objects:
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyLandingPageTitle(){
		return driver.getTitle();
	}
	
	
	//public boolean verifyCorrectUserName(){
	//	return userNameLabel.isDisplayed();
	//}
	
	public  boolean validatezohologo(){
		return zohologo.isDisplayed();
}
	public   void clickonlanguage(){
		Actions action = new Actions(driver);
		action.click(Language).build().perform();
	
}
	
	public CustomersPage clickOnCustomersLink(){
		CustomersLink.click();
		return new CustomersPage();
	}
	
	public SupportPage clickOnSupportLink(){
		SupportLink.click();
		return new SupportPage();
	}
	
	public ContactSalesPage clickOnContactSalesLink(){
		ContactSalesLink.click();
		return new ContactSalesPage();
	}
	
	public SigninPage clickOnSigninLink(){
		SigninLink.click();
		return new SigninPage();
	}

	public FreeSignUpPage clickOnFreeSignUpLink(){
		FreeSignUpLink.click();
		return new FreeSignUpPage();
	}
	
	public  searchpopup validatesearchLink(){
		 searchLink.click();
		return new searchpopup();
	}
		
	public void clickoncrmsubmitrequest() {
		try {
		submitaticket.click();
		Thread.sleep(1000);
		}
		catch (Exception e) {
            System.out.println(e);
        }
	
		submitrequestbtn.click();
	}
	
	
	
}

