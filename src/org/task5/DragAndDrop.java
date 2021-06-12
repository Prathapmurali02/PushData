package org.task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demo.guru99.com/test/drag_drop.html");
			//Debit Side
			WebElement bankScr = driver.findElement(By.id("credit2"));
			WebElement bankDest = driver.findElement(By.id("bank"));
			 WebElement debitScr = driver.findElement(By.id("fourth"));
			 WebElement debitDest= driver.findElement(By.id("amt7"));
			 
			 //Credit Side
			 WebElement salesScr = driver.findElement(By.id("credit1"));
				WebElement salesDest = driver.findElement(By.id("loan"));
				 WebElement creditScr = driver.findElement(By.id("fourth"));
				 WebElement creditDest= driver.findElement(By.id("amt8"));
			 
			 Actions a= new Actions(driver);
			 
			 a.dragAndDrop(bankScr, bankDest).perform();
			 a.dragAndDrop(debitScr, debitDest).perform();
			 a.dragAndDrop(salesScr, salesDest).perform();
			 a.dragAndDrop(creditScr, creditDest).perform();
	}

}
