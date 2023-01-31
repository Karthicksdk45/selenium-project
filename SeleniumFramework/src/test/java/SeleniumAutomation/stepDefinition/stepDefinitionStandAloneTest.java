package SeleniumAutomation.stepDefinition;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import Selenium.SeleniumAutomation.ConfirmationPage;
import Selenium.SeleniumAutomation.ProductCatalogue;
import Selenium.SeleniumAutomation.cartPage;
import Selenium.SeleniumAutomation.checkoutPage;
import SeleniumAutomation.TestComponents.BaseUrl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinitionStandAloneTest extends BaseUrl
{
	public ProductCatalogue prod;
	public cartPage cart;
	public checkoutPage checkout;
	public ConfirmationPage finalPage;
	String country = "India";
	String item = "ADIDAS ORIGINAL";
	@Given("^Enter the valid credentials (.+) and (.+)$")
	public void Enter_the_valid_credentials_userName_and_password(String userName, String password) throws IOException
	{
		launchApp();
		prod = pom.loginCredentials(userName, password);
	}
	
	@When("check for the products available")
	public void check_for_the_products_available()
	{
		prod.addProductToCart(item);
	}
	
	@And("Order the product")
	public void Order_the_product()
	{
		cart = prod.cartButton();
		Assert.assertTrue(cart.compareTo(item));
		checkout = cart.checkout();
		checkout.findCountry(country);
		finalPage = checkout.placeTheOrder();
	}
	
	@Then("verify the confirmation message")
	public void verify_the_confirmation_message()
	{
		System.out.println(finalPage.getOutput());
		driver.close();
	}
}
