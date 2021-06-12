package org.drop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement btncreate = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		btncreate.click();
		Thread.sleep(3000);
		WebElement ddYear = driver.findElement(By.id("year"));
		
		Select s=new Select(ddYear);
		List<WebElement> options = s.getOptions();
		
		for (WebElement drop : options) {
			
			String attribute = drop.getAttribute("value");
			System.out.println(attribute);
			
		}
		
	}

}
