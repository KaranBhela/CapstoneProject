package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DesktopsPageObject;
import utilities.UtilityClass;

public class DesktopsStepDef extends Base{
	
	
	
	DesktopsPageObject desktopsPageObject = new DesktopsPageObject();

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		 desktopsPageObject.clickOnDesktops();
		  logger.info("user clicked on Desktops tab");
		
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
	    // Write code here that turns the phrase above into concrete actions
		desktopsPageObject.clickOnShowAllDesktops();
		logger.info("user clicked on Show All Desktops");
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		Assert.assertTrue(desktopsPageObject.allDesktopsDisplayed());
		logger.info("User sees all items are present in Desktop page");
		UtilityClass.takeScreenShot();
	   
	}
	
	
	
	

	@When("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
	    
		desktopsPageObject.clickOnaddToCartLaptop();;
		logger.info("user clicked on ADD TO CART option on ‘HP LP3065’ item");
		
	}
	
	
	
	

	@When("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
	    desktopsPageObject.selectQuantity(int1);
	    desktopsPageObject.clickAddToCart();
	    logger.info("user clicked on ADD TO CART option on ‘HP LP3065’ item");
	}
	

	@Then("User should see a message ‘Success: you have added HP LP (\\d+) to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart() {
		Assert.assertTrue(desktopsPageObject.successAlertLaptop());
		logger.info("User sees message ‘Success: you have added HP LP to your Shopping cart!’");
		UtilityClass.takeScreenShot();
	    
	}
	

	@When("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktopsPageObject.clickOnaddToCartCannon();
		logger.info("user clicked on ADD TO CART option on ‘Canon EOS 5D’ item");
	    
	}

	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
		desktopsPageObject.clickOnSelectColor();
		desktopsPageObject.clickOnColorRed();
		logger.info("user selected color from dropdown ‘Red’");
	    
	}
	
	

	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
		UtilityClass.takeScreenShot();
	}
	
	
	
	
	

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopsPageObject.clickOnCanon();
		logger.info("user clicked on Canon EOS 5D item");
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopsPageObject.clickOnWriteAReview();
		logger.info("User clicked on write a review link");
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
	   List<Map<String,String>> info = dataTable.asMaps(String.class,String.class);
	  desktopsPageObject.enterYourName(info.get(0).get("yourName"));
	  desktopsPageObject.enterYourReview(info.get(0).get("yourReview"));
	  desktopsPageObject.enterYourRating(info.get(0).get("yourRating"));
	  logger.info("User filled review " + info.toString());
	  UtilityClass.takeScreenShot();
	  
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktopsPageObject.clickOnContinue();
		logger.info("User clicked on Continue Button");
	    
	}

	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
		Assert.assertTrue(desktopsPageObject.submissionAlertisPresent());
		logger.info("User sees a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.");
		UtilityClass.takeScreenShot();
	}
	
}
