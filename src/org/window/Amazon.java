package org.window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearch.sendKeys("Iphone",Keys.ENTER);
		WebElement iphone = driver.findElement(By.xpath("//span[text()='New Apple iPhone 12 (64GB) - Purple']"));
		iphone.click();
		String par = driver.getWindowHandle();
		System.out.println(par);
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		int count=0;
		for (String x : child) {
			if (count==1) {
				
			driver.switchTo().window(x);
			}
			count++;
		}
		WebElement addCart = driver.findElement(By.id("add-to-cart-button"));
		addCart.click();
	}

}
