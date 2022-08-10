package com.zerodha.QA11.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	 
	public void intializeBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\com.zerodha1.QA11\\src\\main\\java\\com\\zerodha\\QA11\\Resources\\chromedriver.exe");
			driver = new ChromeDriver(); 
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\Selenium All Jars\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver(); 
		}else {
			System.out.println("Wrong Browser Selected");
		}
		driver.get("https://kite.zerodha.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	

}
