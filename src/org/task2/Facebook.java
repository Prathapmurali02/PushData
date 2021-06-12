package org.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("Prathap@gmail.com");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("1234567");
		
		

	}

}
