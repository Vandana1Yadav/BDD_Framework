package com.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition_Spreecom extends AbstractPageStepDefinition {

	WebDriver driver = getDriver();
	

	@Given("User enters Spreecom Login page")
	public void user_enters_spreecom_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();	
		driver.get("https://demo.spreecommerce.org/");
	}

	@When("user enter valid username {string}")
	public void user_enter_valid_username(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//*[@id='account-button']")).click();
		
		
		driver.findElement(By.xpath("//*[text()='LOGIN']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='spree_user_email']")).sendKeys("vandana@spree.com");
		Thread.sleep(2000);
		
		
	}

	@When("user enter valid password {string}")
	public void user_enter_valid_password(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//*[@name='spree_user[password]']")).sendKeys("vandanayadav");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='commit']")).click();
	}
}
