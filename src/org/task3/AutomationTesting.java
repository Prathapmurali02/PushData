package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" http://demo.automationtesting.in/Register.html");
		
		WebElement txtfirstName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		txtfirstName.sendKeys("prathap");
		
		WebElement txtLastName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtLastName.sendKeys("Murali");

	}

}
