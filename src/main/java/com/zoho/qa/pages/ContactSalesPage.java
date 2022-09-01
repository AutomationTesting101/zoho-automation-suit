package com.zoho.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoho.qa.base.TestBase;

public class ContactSalesPage extends TestBase{

	@FindBy(xpath = "//h1[1]")
	WebElement pagetext;
	
	@FindBy(xpath = "//h4[normalize-space()='Asia-Pacific']")
	WebElement containtclick;
	
	@FindBy(xpath = "//div[@class='zlocation add-in active']//div[@class='zlocation-inner']")
	WebElement Box;
	
	// Initializing the Page Objects:
			public ContactSalesPage() {
				PageFactory.initElements(driver, this);
			}
		
			public boolean verifypagetext(){
				return pagetext.isDisplayed();
			}

			public void containtclick(){
				containtclick.click();
			}	
			
			public boolean verifypBox(){
				return Box.isDisplayed();
			}
}
