package stepDefinitions;

import java.io.IOException;
import java.util.List;
import Functions.BaseMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageContainer.GreenKartHomePage;

public class stepDefinition extends BaseMethods
{
	GreenKartHomePage home;
	List<String> prods;
	String veg = "Tomato ";
	@Given("I am in the green kart page")
	public void I_am_in_the_green_kart_page() throws IOException
	{
		LaunchApp();
	}
	
	@When("^I click on the search bar and pass the data as \"([^\"]*)\"$")
	public void I_click_on_the_search_bar_and_pass_the_data(String prod)
	{
		homePage.searchBox(prod);
		 
	}
	
	@And("get the data displaying in the page")
	public void get_the_data_displaying_in_the_page()
	{
		prods = homePage.totalProductDisplaying();
		
		System.out.println(prods);
	}
	
	@Then("compare the data sent over search bar and data displaying")
	public void compare_the_data_sent_over_search_bar_and_data_displaying()
	{
		System.out.println(prods.contains(veg));
	}
}
