package org.drop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		WebElement btnCountry = driver.findElement(By.name("country"));
		
		Select s=new Select(btnCountry);
		List<WebElement> c = s.getOptions();
		for (WebElement r : c) {
			
			String attribute = r.getAttribute("value");
			System.out.println(attribute);
			
		}
		
			
		}
	}


