package Selenium_Class;

import java.awt.Window;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Sugetions {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:/Users/PAWAN SINGH/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	
	driver.findElement(By.id("lst-ib")).sendKeys("java");
	Thread.sleep(5000);

	//	List<WebElement> menulist =driver.findElements(By.cssSelector(".sbqs_c"));
	
	List<WebElement> menulist =driver.findElements(By.xpath("//li/div/div"));
	
	for (int i =0; i<menulist.size();i++)
	{
		
		WebElement option = menulist.get(i);
		String optionText = option.getText();
		Thread.sleep(3000);
		System.out.println(optionText);
	}
	driver.close();
}
}
