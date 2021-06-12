package org.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement txtSearch = driver.findElement(By.name("q"));
		txtSearch.sendKeys("Iphone");
		WebElement btnSearch = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		btnSearch.click();
		Thread.sleep(7000);
		TakesScreenshot t= (TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Automation\\Selenium\\Selenium\\Screenshot\\Iphone11.png");
		FileUtils.copyFile(src, dest);

	}

}
