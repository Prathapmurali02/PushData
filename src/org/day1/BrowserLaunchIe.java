package org.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunchIe {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver","D:\\Automation\\Selenium\\Selenium\\Drivers\\IEDriverServer.exe" );
		
		WebDriver driver =new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://gmail.com/");
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		
		System.out.println(title);

	}

}
