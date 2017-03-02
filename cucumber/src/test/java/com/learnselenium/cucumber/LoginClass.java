package com.learnselenium.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginClass {

	@Given("^with aepdsweb webapp$")
	public void with_aepdsweb_webapp() throws Throwable {
		System.out.println("one tyr");
	}

	@When("^I enter username and password$")
	public void i_enter_username_and_password() throws Throwable {
		System.out.println("two");

	}

	@Then("^I should be able to login$")
	public void i_should_be_able_to_login() throws Throwable {
		System.out.println("three");

	}

}
