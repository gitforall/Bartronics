package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	WebDriver driver;
	
	@Given("^Firefox browser$")
	public void Firefox_browser() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Hari\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://192.168.1.190/sgst");
	}
	
	//@When("^I try to login with valid credentials$")
	@When("^I try to login with valid credentials \"(.*)\" and \"(.*)\"$")
	public void I_try_to_login_with_valid_credentials(String username, String password) throws Throwable {
		
		driver.findElement(By.name("UserName")).sendKeys(username);
		driver.findElement(By.name("Password")).sendKeys(password);
		
	}

	@Then("^application should login$")
	public void application_should_login() throws Throwable {
		driver.findElement(By.id("loginbtn")).click();
		System.out.println("ok");
	}

}
