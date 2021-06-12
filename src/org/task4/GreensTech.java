package org.task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement Details = driver.findElement(By.xpath(" (//p[contains(@class,'mail-info')])[3]"));
		
		String text = Details.getText();
		
		System.out.println(text);

	}

}
