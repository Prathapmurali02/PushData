package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aamzon {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement txt = driver.findElement(By.xpath("//input[@type='text']"));
		txt.sendKeys("iphone");
		
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		search.click();

	}

}
