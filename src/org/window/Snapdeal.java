package org.window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		WebElement txtSearch = driver.findElement(By.name("keyword"));
		txtSearch.sendKeys("power bank",Keys.ENTER);
		Thread.sleep(3000);
		WebElement clickPower = driver.findElement(By.xpath("(//p[@class='product-title '])[1]"));
		clickPower.click();
		String par = driver.getWindowHandle();
		System.out.println(par);
		Set<String> all = driver.getWindowHandles();
		System.out.println(all);
		for (String x : all) {
			if (!par.equals(x)) {
				driver.switchTo().window(x);
				
			}
			
		}
		WebElement addCart = driver.findElement(By.xpath("//span[text()='add to cart']"));
		addCart.click();
	}

}
