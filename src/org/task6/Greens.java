package org.task6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		Actions a= new Actions(driver);
		
		driver.findElement(By.id("heading20")).click();
		
		WebElement btnCTS = driver.findElement(By.xpath("//a[contains(text(),'CTS Interview')]"));
		
		a.contextClick(btnCTS).perform();
		

	}

}
