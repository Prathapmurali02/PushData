package org.javasc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.instagram.com/accounts/login/?hl=en)");
		Thread.sleep(5000);
		WebElement txtUser = driver.findElement(By.xpath("//input[@type='text']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Prathap')", txtUser);
		Object ob = js.executeScript("return arguments[0].getAttribute('value')", txtUser);
		String name=(String)ob;
		System.out.println(name);
		WebElement txtPass = driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].setAttribute('value','12345')", txtPass);
		String pass=(String)js.executeScript("return arguments[0].getAttribute('value')",txtPass);
		System.out.println(pass);
	}
	}


