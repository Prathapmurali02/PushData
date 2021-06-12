package org.task6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gmail {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		Actions a= new Actions(driver);
		
		WebElement btnGmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		a.contextClick(btnGmail).perform();
		
		Robot r= new Robot();
		int keyPress=0;
		int keyRelease=0;
		
		for (int i =keyPress; i <6; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			
			for (int j =keyRelease; j <6; j++) {
				
				r.keyRelease(KeyEvent.VK_DOWN);
				
				}
		}
	
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
