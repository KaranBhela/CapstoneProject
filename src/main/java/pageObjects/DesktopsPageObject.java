package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopsPageObject extends Base {
	
	public DesktopsPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div[1]/img")
	private WebElement icon;

	@FindBy(xpath="//a[(text()='Desktops')]")
	private WebElement desktops;
	
	@FindBy(xpath="//a[text()='PC (0)']")
	private WebElement pcDropdown;
	
	@FindBy(xpath="//a[(text()='Mac (1)')]")
	private WebElement macsDropdown;
	
	@FindBy(xpath="//a[(text()='Show All Desktops')]")
	private WebElement showAllDesktops;
	
	
	
	@FindBy(xpath="//*[contains(text(), '12 of 12')]")
	private WebElement allDesktops;
	
	
	@FindBy(xpath="//a[(text()='Continue')]")
	private WebElement continueButton;
	
	@FindBy(xpath="//button[@id='list-view']")
	private WebElement listView;
	
	@FindBy(xpath="//button[@id='grid-view']")
	private WebElement gridView;
	
	@FindBy(xpath="//a[(text()='iMac')]")
	private WebElement iMacLink;
	
	@FindBy(xpath="(//button[@type='button'])[9]")
	private WebElement addtoCartButton;
			
	@FindBy(xpath="(//button[@type='button'])[10]")
	private WebElement addtoWishListButton;	
	
	@FindBy(xpath="(//button[@type='button'])[11]")
	private WebElement compareProductButton;
	
	@FindBy(xpath="//select[@id='input-sort']")
	private WebElement sortByDropdown;
			
	@FindBy(xpath="//select[@id='input-limit']")
	private WebElement showDropdown;
	
	@FindBy(xpath="(//i[@class='fa fa-shopping-cart'])[5]")
	private WebElement addToCartLaptop;
	
	//input[@id='input-quantity']
	@FindBy(xpath="//input[@id='input-quantity']")
	private WebElement quantitySelect;
	
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement addToCartButton;
	
	@FindBy(xpath="//*[contains(text(), 'Success: You')]")
	private WebElement successAlertMessageLaptop;
	
	@FindBy(xpath="(//i[@class='fa fa-shopping-cart'])[4]")
	private WebElement addToCartCannon;

	
	@FindBy(xpath="//select[@id='input-option226']")
	private WebElement selectColor;
	
	@FindBy(xpath="//option[@value='15']")
	private WebElement colorRed;
	
	@FindBy(xpath="//a[text()='Canon EOS 5D']")
	private WebElement canonSelect;	
	
	@FindBy(xpath="//a[text()='Write a review']")
	private WebElement writeAReview;	
	
	@FindBy(xpath="//input[@id='input-name']")
	private WebElement yourName;	
	
	@FindBy(xpath="//textarea[@id='input-review']")
	private WebElement yourReview;
	
	@FindBy(xpath="//input[@value='5']")
	private WebElement yourRating;
	
	@FindBy(xpath="//button[@id='button-review']")
	private WebElement continueButtonReview;
	
	//*[contains(text(), 'Thank you for your review.')]
	@FindBy(xpath="//*[contains(text(), 'Thank you for your review.')]")
	private WebElement submissionAlert;
	
	public void clickOnDesktops() {
		desktops.click();
	}
	
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}
	
	
	public boolean allDesktopsDisplayed() {
		if(allDesktops.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickOnaddToCartLaptop() {
		addToCartLaptop.click();
	}
	
	public void selectQuantity(Integer int1) {
		quantitySelect.sendKeys(String.valueOf(int1));
	}
	
	public void clickAddToCart() {
		addToCartButton.click();
	}
	
	public boolean successAlertLaptop() {
		if(successAlertMessageLaptop.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickOnaddToCartCannon() {
		addToCartCannon.click();
	}
	
	public void clickOnSelectColor() {
		selectColor.click();
	}
	
	public void clickOnColorRed() {
		colorRed.click();
	}
	
	public void clickOnCanon() {
		canonSelect.click();
	}
	
	public void clickOnWriteAReview() {
		writeAReview.click();
	}
	
	public void enterYourName(String name) {
		yourName.sendKeys(name);
	}
	
	public void enterYourReview(String review) {
		yourReview.sendKeys(review);
	}
	
	public void enterYourRating(String value) {
		yourRating.click();
	}
	
	
	public void clickOnContinue() {
		continueButtonReview.click();
	}
	
	public boolean submissionAlertisPresent() {
		if(submissionAlert.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	
	
}

