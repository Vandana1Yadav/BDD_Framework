package com.StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import com.aventstack.extentreports.util.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;

public class StepDefinition_WebOrder extends AbstractPageStepDefinition {
	
	WebDriver driver = getDriver();

	@Given("User is on WebOrder Login Page")
	public void user_is_on_web_order_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
	}

	@When("User enters {string} and {string} of WebOrder app")
	public void user_enters_and_of_web_order_app(String uname, String upass) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(uname);
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(upass);
	}

	@When("User click on Login button of WebOrder app")
	public void user_click_on_login_button_of_web_order_app() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	}

	@Then("User should be in Home page of WebOrder app and Logout button should display")
	public void user_should_be_in_home_page_of_web_order_app_and_logout_button_should_display() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		driver.findElement(By.linkText("Logout")).isDisplayed();
	}
	@Then("User should get proper {string}")
	public void user_should_get_proper(String ExpResult) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		if (ExpResult.equalsIgnoreCase("Invalid Login or Password.")) {
			String ActResult = driver.findElement(By.id("ctl00_MainContent_status")).getText();
			Assert.assertEquals(ActResult, ExpResult);
			
		} else 
		{
			String ActResult = driver.findElement(By.linkText("Logout")).getText();
			Assert.assertEquals(ActResult, ExpResult);
			driver.findElement(By.linkText("Logout")).click();
		}
	}

}
