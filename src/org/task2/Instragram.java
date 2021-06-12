package org.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instragram {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
					
					WebDriver driver =new ChromeDriver();
					
					driver.manage().window().maximize();
					
					driver.get("https://www.instagram.com/accounts/login/?hl=en) login page ");
					
					WebElement txtUserName = driver.findElement(By.name("username"));
					txtUserName.sendKeys("Prathap@gmail.com");
					
					WebElement txtPassword = driver.findElement(By.name("password"));
					txtPassword.sendKeys("1234567");

	}

}
