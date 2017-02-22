package com.hari.test;

import java.awt.Dimension;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Hari\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://faculty.washington.edu/chudler/java/boxes.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> ele = driver.findElements(By.xpath("//input[@type='checkbox']"));
		 
		for (WebElement webElement : ele) {
			
			webElement.click();
		}
	}

}
