package stepDefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	WebDriver driver;
	
	@Given("when user is on HomePage")
	public void when_user_is_on_home_page() {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.saucedemo.com/");
	   
	}
	
	@When("user enter  userName and password")
	public void user_enter_user_name_and_password() {
		
		
	}
	
	@When("user enter  {string} and {string}")
	public void user_enter_and(String userName, String password) {
		driver.findElement(By.id("user-name")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@Then("user is able to see login button")
	public void user_is_able_to_see_login_button() {
		Assert.assertTrue(true);
	}
	
	@When("user enter incorrect {string} and {string}")
	public void user_enter_incorrect_and(String userName, String password) {
	  System.out.println(userName + " "+ password);
	}
	@Then("user should not able to see logout button")
	public void user_should_not_able_to_see_logout_button() {
	    System.out.println("not a test data");
	}
	
	@When("user enters following data")
	public void user_enters_following_data(DataTable dataTable) {
		Map<String, String> map = dataTable.asMap();
	    map.forEach((key, value)->{
	    	System.out.println(key +" "+ value);
	    });
}
}
