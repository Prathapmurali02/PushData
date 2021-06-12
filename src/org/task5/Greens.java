package org.task5;

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
		
		Actions a=new Actions(driver);
	
	WebElement btnCourses = driver.findElement(By.xpath("//div[@title='Courses']"));
	
	a.moveToElement(btnCourses).perform();
	
WebElement clickSoftware = driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
	
	a.moveToElement(clickSoftware).perform();
	
WebElement clickSelenium = driver.findElement(By.xpath("//span[contains(text(),'Selenium')]"));
	
clickSelenium.click();
	
	
	
	
	
	}

}
