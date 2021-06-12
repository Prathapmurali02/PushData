package org.frame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		WebElement frame = driver.findElement(By.name("login_page"));
		driver.switchTo().frame(frame);
		WebElement btnContinue = driver.findElement(By.xpath("//img[@alt='continue']"));
		btnContinue.click();
		Alert a=driver.switchTo().alert();
		a.accept();
		
	}

}
