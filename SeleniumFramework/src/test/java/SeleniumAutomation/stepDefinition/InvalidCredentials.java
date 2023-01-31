package SeleniumAutomation.stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import SeleniumAutomation.TestComponents.BaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvalidCredentials extends BaseUrl
{	
	@Given("I am in the login page of app")
	public void I_am_in_the_login_page_of_app() throws IOException
	{
		pom = launchApp();
	}
	
	@When("^I enter the invalid credentials (.+) and (.+) and click on login button$")
	public void I_enter_the_invalid_credentials_and_click_on_login_button(String un,String pwd)
	{
		pom.loginCredentials(un, pwd);	
	}
	
	@Then("Check for the response received")
	public void Check_for_the_response_received()
	{
		System.out.println(pom.getErrorMessage());
	}
}
