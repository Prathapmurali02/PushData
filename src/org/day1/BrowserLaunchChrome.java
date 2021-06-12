package org.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchChrome {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
	
	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://gmail.com/");
	
	String currentUrl = driver.getCurrentUrl();
	
	System.out.println(currentUrl);
	
	String title = driver.getTitle();
	
	System.out.println(title);
	
	
		

	}

}
