package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	public WebDriver driver;
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

	@Given("user navigates to login page")
	public void user_navigates_to_login_page() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();	
	}

	@When("user enters valid email address {string} into email field")
	public void user_enters_valid_email_address_into_email_field(String validemailText) {
		driver.findElement(By.id("input-email")).sendKeys(validemailText);
	}

	@And("user enters valid password {string} into the password field")
	public void user_enters_valid_password_into_the_password_field(String validpasswordText) {
		driver.findElement(By.id("input-email")).sendKeys(validpasswordText);
	}

	@And("user clicks on Login button")
	public void user_clicks_on_login_button() {
		System.out.println("Hi");
	}

	@Then("user gets successfully logged in")
	public void user_gets_successfully_logged_in() {
		System.out.println("Hi");
	}

	@When("user enters invalid email address {string} into email field")
	public void user_enters_invalid_email_address_into_email_field(String invalidEmailText) {
		System.out.println("Hi");
	}

	@And("user enters invalid password {string} into the password field")
	public void user_enters_invalid_password_into_the_password_field(String invalidPasswordText) {
		System.out.println("Hi");
	}

	@Then("user gets a warning message of credentials mismatch")
	public void user_gets_a_warning_message_of_credentials_mismatch() {
		System.out.println("Hi");
	}

	@When("user keeps email address field blank")
	public void user_keeps_email_address_field_blank() {
		System.out.println("Hi");
	}

	@And("user keeps password field blank")
	public void user_keeps_password_field_blank() {

	}

}
