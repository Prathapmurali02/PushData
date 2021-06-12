package org.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Automation\\Selenium\\Selenium\\Drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
         driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("appumurali92@gmail.com");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("7401135463");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();

	}

}
