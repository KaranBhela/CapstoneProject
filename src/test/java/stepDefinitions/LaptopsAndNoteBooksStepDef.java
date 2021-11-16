package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LaptopsNoteBooksPageObject;
import utilities.UtilityClass;

public class LaptopsAndNoteBooksStepDef extends Base{
	
	
	
	LaptopsNoteBooksPageObject laptopsAndNoteBooksPageObject = new LaptopsNoteBooksPageObject();
	

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
	    // Write code here that turns the phrase above into concrete actions
	  laptopsAndNoteBooksPageObject.clickOnLaptopsDropdown();
	  logger.info("user clicked on Laptop & Notebook tab");
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
	    // Write code here that turns the phrase above into concrete actions
		 laptopsAndNoteBooksPageObject.clickOnShowAllLaps();
		  logger.info("user clicked on Show all Laptop & Notebook option");
	}

	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
	    // Write code here that turns the phrase above into concrete actions
		laptopsAndNoteBooksPageObject.clickOnMacBook();
		  logger.info("user clicked on Macbook option");
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
		laptopsAndNoteBooksPageObject.clickOnaddToCartButton();
		 logger.info("user clicked on add to cart option");
	}

	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(laptopsAndNoteBooksPageObject.successMessageisPresent());
		logger.info("User sees a message ‘Success: You have added MacBook to your shopping cart!’");
		UtilityClass.takeScreenShot();
	   
	}

	@Then("User should see '(\\d+) item(s) (\\d+)' showed to the cart")
	public void user_should_see_item_s_showed_to_the_cart() {
		Assert.assertTrue(laptopsAndNoteBooksPageObject.cartTotalMessage());
		logger.info("User sees a message ‘1 item(s)-602.00’ showed to the cart");
		UtilityClass.takeScreenShot();
		
	}


	@Then("User click on cart option")
	public void user_click_on_cart_option() {
	    // Write code here that turns the phrase above into concrete actions
		laptopsAndNoteBooksPageObject.clickOnCartButton();
		 logger.info("user clicked on cart button");
	   
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
	    // Write code here that turns the phrase above into concrete actions
		laptopsAndNoteBooksPageObject.clickOnRemove();
		 logger.info("user clicked on red X button to remove from cart");
	   
	}

	@Then("item should be removed and cart should show '(\\d+) item(s)’")
	public void item_should_be_removed_and_cart_should_show_item_s() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(laptopsAndNoteBooksPageObject.emptyCartDisplayed());
		logger.info("item is removed and cart should show ‘0 item(s)’");
		UtilityClass.takeScreenShot();
	}

	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
	    // Write code here that turns the phrase above into concrete actions
		laptopsAndNoteBooksPageObject.clickOnProductCompare();
		 logger.info("user clicked on product comparison button");
	}

	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
	    // Write code here that turns the phrase above into concrete actions
		laptopsAndNoteBooksPageObject.clickOnProductCompareAir();
		 logger.info("user clicked on product comparison button");
	}

	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(laptopsAndNoteBooksPageObject.successAlertProductMessage());
		logger.info("User sees a message ‘Success: You have added MacBook Air to your product comparison!’");
		UtilityClass.takeScreenShot();
	    
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
	    // Write code here that turns the phrase above into concrete actions
		laptopsAndNoteBooksPageObject.clickOnProductComLink();
		 logger.info("user clicked on product comparison link");
	    
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		Assert.assertTrue(laptopsAndNoteBooksPageObject.productChart());
		logger.info("User sees product chart");
		UtilityClass.takeScreenShot();
	    
	}
//---------------------------------------------------------------------------------------------------
	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		laptopsAndNoteBooksPageObject.clickOnHeartIcon();
		 logger.info("user clicked on heart icon to add 'Sony VaIO' to wish list");
	    
	}

	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wishlist!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wishlist() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(laptopsAndNoteBooksPageObject.alertToLoginDisplayed());
		logger.info("User sees message ‘You must login or create an account to save Sony VAIO to your wishlist!’");
		UtilityClass.takeScreenShot();
	    
	}

	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
	    // Write code here that turns the phrase above into concrete actions
		laptopsAndNoteBooksPageObject.clickOnMacBookPro();;
		logger.info("user clicked on MacBook Pro");
	   
	}

	@Then("User should see price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(laptopsAndNoteBooksPageObject.macBookPriceDisplayed());
		logger.info("User should see ‘${double}’ price tag is present on UI.");
		UtilityClass.takeScreenShot();
	}
	
	
	
	
}
