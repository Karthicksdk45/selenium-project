package SeleniumAutomation.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinition
{
	WebDriver driver = new ChromeDriver();
	@Given("I am in the login page")
	public void I_am_in_the_login_page()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	@When("^I enter the valid (.+) and (.+)$")
	public void Enter_valid_credentials(String un,String pwd)
	{
		driver.findElement(By.id("userEmail")).sendKeys(un);
		
		driver.findElement(By.id("userPassword")).sendKeys(pwd);
		
		driver.findElement(By.id("login")).click();
	}
	
	@Then("I will be getting the title as {string}")
	public void I_will_be_landing_to_the_home_page(String data)
	{
		System.out.println(driver.getTitle()+"   "+data);
		
		Assert.assertEquals(driver.getTitle(), data);
	}
}
