package org.task6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/webhp");
		
		Actions a= new Actions(driver);
		
		WebElement txtSearch = driver.findElement(By.name("q"));
		txtSearch.sendKeys("Velmurugan");
		
		a.doubleClick(txtSearch).perform();
	}

}
