package org.task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Actions a= new Actions(driver);
		
		WebElement btnPrime = driver.findElement(By.id("nav-link-prime"));
		a.moveToElement(btnPrime).perform();
		
		WebElement btnFree = driver.findElement(By.id("nav-flyout-prime"));
		a.moveToElement(btnFree).perform();

	}

}
