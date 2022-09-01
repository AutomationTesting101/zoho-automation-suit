package com.zoho.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;




public class TestBase {


	public static WebDriver driver;
	public static Properties prop;
	//public  static EventFiringWebDriver e_driver;
	//public static WebEventListener eventListener;
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+  "\\src\\main\\java\\com\\zoho"
					+ "\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	


	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\selenium file\\webdriver\\chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "D:\\selenium file\\webdriver\\geckodriver.exe");	
			driver = new FirefoxDriver(); 
		}
		
	
		/*e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		public EventFiringWebDriver register​(WebDriverEventListener eventListener);
		driver = e_driver;*/
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
    new WebDriverWait(driver, Duration.ofSeconds(120));

		
	driver.get(prop.getProperty("url"));
   }
	
	
	
	
}
