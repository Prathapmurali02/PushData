package org.task4;

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
		
		WebElement txtEmail = driver.findElement(By.xpath("(//input[contains(@class,'inputtext _55r1 _6luy')])"));
		txtEmail.sendKeys("Prathap");
		String attribute = txtEmail.getAttribute("value");
		System.out.println(attribute);
		if (attribute.equalsIgnoreCase("Prathap")) {
			System.out.println("Username is Correct");
			
		}
		

		
		WebElement txtPass = driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1 _6luy _9npi')]"));
		txtPass.sendKeys("12345");
		String attribute1 = txtPass.getAttribute("value");
		System.out.println(attribute1);
		if (attribute1.equalsIgnoreCase("12345")) {
			System.out.println("Password is Correct");
			
		}
	
			
		}
		
	}


