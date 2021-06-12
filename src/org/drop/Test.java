package org.drop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://output.jsbin.com/osebed/2");
		WebElement ddnfruits = driver.findElement(By.id("fruits"));
		
		Select s=new Select(ddnfruits);
		boolean b = s.isMultiple();
		System.out.println(b);
		s.selectByVisibleText("Apple");
		s.selectByValue("banana");
		s.selectByIndex(3);
		
		List<WebElement> all = s.getAllSelectedOptions();
		for (WebElement x : all) {
			String text = x.getText();
			System.out.println(text);
			
		}
		WebElement first = s.getFirstSelectedOption();
		String text1 = first.getText();
		System.out.println(text1);

	}

}
