package com.cucumber;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTables {

	WebDriver driver;
	
	@Given("^User is on Home Page$")
	public void User_is_on_Home_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Hari\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@When("^User Navigate to LogIn Page$")
	public void User_Navigate_to_LogIn_Page() throws Throwable {
		driver.get("http://192.168.1.190/ams");
	}

	@When("^User enters Credentials to LogIn$")
	public void User_enters_Credentials_to_LogIn(DataTable usercredentials) throws Throwable {
			
		//Write the code to handle Data Table
				List<List<String>> data = usercredentials.raw();

				//This is to get the first data of the set (First Row + First Column)
				driver.findElement(By.name("UserName")).sendKeys(data.get(0).get(0)); 

				//This is to get the first data of the set (First Row + Second Column)
			    driver.findElement(By.name("Password")).sendKeys(data.get(0).get(1));

			    driver.findElement(By.id("Login")).click();
			  
			    
			    
	}

	@Then("^Message displayed Login Successfully$")
	public void Message_displayed_Login_Successfully() throws Throwable {
	
		System.out.println("Log in succesful ");
	}

}
