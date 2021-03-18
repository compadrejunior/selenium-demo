package br.com.oatsolutions.selenium.demo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class NewTest {
	public String driverPath = "c:\\Selenium\\chromedriver.exe";
	public WebDriver driver;
	
	@Test
	public void locateWebsite() {
		try {
			driver.get("http://www.google.com");
			Thread.sleep(3000);
			//driver.manage().window().maximize();
			WebElement search = driver.findElement(By.name("q"));
			search.sendKeys("OAT Solutions \n");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@BeforeSuite
	public void beforeSuite() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
	}
	@AfterSuite
	public void afterSuite() {
		driver.close();
	}

}
