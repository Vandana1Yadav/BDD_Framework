package com.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends AbstractPageStepDefinition {

	//static WebDriver driver = null;
	
	WebDriver driver = getDriver();
	
	
	@Given("User is on Google Home Page")
	public void user_is_on_google_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();	
		driver.get("https://www.google.com/");
	}

	@When("User Enter the keyword {string}")
	public void user_enter_the_keyword(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
	}

	@When("User click on Search Button")
	public void user_click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	   // driver.findElement(By.name("btnK")).click();
	}

	@Then("Search result related to {string} word should display")
	public void search_result_related_to_word_should_display(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		
		System.out.println("Search related to Selenium get Displayed");
		driver.quit();
	}
	
	@Given("User is on Web Order url")
	public void user_is_on_web_order_url() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();	
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
	}

	@When("User Enter the Login {string}")
	public void user_enter_the_login(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		
		
	}

	@When("User Enter the Password {string}")
	public void user_enter_the_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
	}

	@When("User click on Login Button")
	public void user_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	}

	@Then("{string} Home page should display")
	public void home_page_should_display(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.linkText("Logout")).isDisplayed();
		//driver.close();
	}

	@When("User should be able to from the Application by clicking on LogOut")
	public void user_should_be_able_to_from_the_application_by_clicking_on_log_out() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.linkText("Logout")).click();
	}
	@Then("User should be taken back to LogIn page")
	public void user_should_be_taken_back_to_log_in_page() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("ctl00_MainContent_login_button")).isDisplayed();
		
		//driver.close();
	}
	
	@When("User Clicks on Order link in WebOrder")
	public void user_clicks_on_order_link_in_web_order() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		driver.findElement(By.linkText("Order")).click();
	}
	@When("User enters quantity, customer name, street, city, zip, card, card number, expire date in WebOrder")
	public void user_enters_quantity_customer_name_street_city_zip_card_card_number_expire_date_in_web_order() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("2");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("Abc");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("xyz");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("1001");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("1234");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("22/44");

	}
	@When("User Click on Process Button in WebOrder")
	public void user_click_on_process_button_in_web_order() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();


	}
	@Then("User should see order success message in WebOrder")
	public void user_should_see_order_success_message_in_web_order() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/div/strong")).isDisplayed();


	}
	
	
	

}
