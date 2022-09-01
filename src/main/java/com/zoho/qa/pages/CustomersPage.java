package com.zoho.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoho.qa.base.TestBase;

public class CustomersPage extends TestBase {

	@FindBy(xpath = "//body/div[@class='main-container-wrapper']/div[@class='main-container blog']/div[@class='row nomargin']/section/div[@class='region region-content']/section[@id='block-system-main']/div[@class='field-body']/div[@class='banner-wrap']/div[@class='banner-slider slick-initialized slick-slider']/div[@class='slick-list draggable']/div[@class='slick-track']/div[@class='img-part zcpopup-controller slick-slide slick-current slick-active']/img[1]")
	WebElement verifypageimage;
	
	@FindBy(xpath = "//div[@class='single-reset-filter active']")
	WebElement clearall;
	
	// Initializing the Page Objects:
			public CustomersPage() {
				PageFactory.initElements(driver, this);
			}
		
			public boolean verifypageimage(){
				return verifypageimage.isDisplayed();
			}
			
			
			public void selecttabByName(String name){
				driver.findElement(By.xpath("//li[@id='"+name+"']")).click();
			}
			
			public void clearall() {
			clearall.click();
			}	
			
}
