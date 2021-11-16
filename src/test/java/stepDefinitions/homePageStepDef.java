package stepDefinitions;
import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObject;
import utilities.UtilityClass;
public class homePageStepDef extends Base {

	HomePageObject homePageObject = new HomePageObject();
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
	    // Write code here that turns the phrase above into concrete actions
		String actualPageTitile = driver.getTitle();
		String expectedPageTitle = "TEK SCHOOL";
		// Assertion is to verify actual meets the expected
		// if actual does not equals to expected value then execution will stop
		// and test step will fail.
		Assert.assertEquals(expectedPageTitle, actualPageTitile);
		logger.info("Actual Title is matching with expected title");
		UtilityClass.takeScreenShot();
	    
	}

	@When("User click on Currency")
	public void user_click_on_currency() {
	    // Write code here that turns the phrase above into concrete actions
		homePageObject.clickOnCurrency();
		logger.info("user clicked on Currency");
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
		homePageObject.clickOnEuroCurrency();
		logger.info("user clicked on Euro Currency");
	   
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(homePageObject.euroSignisPresent());
		logger.info("currency value changed to Euro");
		UtilityClass.takeScreenShot();
	    
	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
	    // Write code here that turns the phrase above into concrete actions
		homePageObject.clickOnShoppingCart();
		logger.info("user clicked on shopping cart");
	    
	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(homePageObject.emptyCartSignisPresent());
		logger.info("Your shopping cart is empty! message should display");
		UtilityClass.takeScreenShot();
	}


	
	
	
	
	
}
