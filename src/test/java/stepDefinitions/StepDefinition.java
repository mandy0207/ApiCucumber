package stepDefinitions;

import java.util.Map;

import org.testng.Assert;

import context.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class StepDefinition {

	LoginPage lp = new LoginPage(DriverManager.getDriver());
	
	

	@Given("when user is on HomePage")
	public void when_user_is_on_home_page() {
	  
		Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.saucedemo.com");
	}
	
	
	@When("user enter  userName and password")
	public void user_enter_user_name_and_password() {
		
		
	}
	
	@When("user enter  {string} and {string}")
	public void user_enter_and(String userName, String password) {
		lp.login(userName, password);
	}
	
	@Then("user is able to see login successfully")
	public void user_is_able_to_see_login_successfully() {
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
