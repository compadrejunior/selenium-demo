package br.com.oatsolutions.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		try {
			System.setProperty("webdriver.chrome.driver", "c:\\Selenium\\chromedriver.exe");
			driver.get("http://www.google.com");
			Thread.sleep(3000);
			//driver.manage().window().maximize();
			WebElement search = driver.findElement(By.name("q"));
			search.sendKeys("OAT Solutions \n");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			driver.close();
		}
		
	}

}
