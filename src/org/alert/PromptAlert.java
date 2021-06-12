package org.alert;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement btnClick = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		btnClick.click();
		WebElement prompt = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		prompt.click();
		
		
		
		Alert a=driver.switchTo().alert();
		
	a.sendKeys("Prathap");
				a.accept();
	}

}
