package org.task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		
		Actions a=new Actions(driver);

		WebElement btnMobiles= driver.findElement(By.xpath("//span[text()='Mobile & Tablets']"));
		
		a.moveToElement(btnMobiles).perform();
		
WebElement btnLaunch= driver.findElement(By.xpath("//span[text ()='New Launches Covers']"));
		
 btnLaunch.click();
		


	}

}
