package com.hari.test;

import java.util.List;

import my_Utils.MyLib;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class PageLoadingTime {

	WebDriver driver;

	@Test
	public void pageloadtime() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Hari\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		MyLib.pageloadingtime(driver, "http://192.168.1.190/sgst");

		System.out.println(driver.getTitle());
		
		//WebElement id = driver.findElement(By.id("name"));
		WebElement id =driver.findElement(By.xpath("//input[@name='UserName']"));
		WebElement pwd = driver.findElement(By.name("Password"));
		id.sendKeys("hari");
		
/*Syntax- //htmltag[@attname='attvalue'] or //html[text()='textvalue'] or //htmltag[contains(text(),'textvalue')] 
 * or //htmltag[contains(@attname,'attvalue')]
 */
		
		Thread.sleep(10L);
		Actions act = new Actions(driver);
		
		
		//EventFiringWebDriver eDriver=new EventFiringWebDriver(driver);

		act.contextClick(id);
		act.sendKeys(id , Keys.chord(Keys.CONTROL,"a")).perform();
		act.sendKeys(id , Keys.chord(Keys.CONTROL,"c")).perform();
		act.sendKeys(pwd , Keys.chord(Keys.CONTROL,"v")).perform();
		
		System.out.println("END");
		
	}
}
