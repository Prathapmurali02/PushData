package org.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunchFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Automation\\Selenium\\Selenium\\Drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.greenstechnologys.com/");
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
		

	}

}
