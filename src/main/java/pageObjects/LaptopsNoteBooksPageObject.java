package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopsNoteBooksPageObject extends Base{

	public LaptopsNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='Laptops & Notebooks']")
	private WebElement laptopNoteDropdown;
	
	@FindBy(xpath="//a[text()='Macs (0)']")
	private WebElement macsDropdown;
	
	@FindBy(xpath="//a[text()='Windows (0)']")
	private WebElement windowsDropdown;
	
	@FindBy(xpath="//a[(text()='Show All Laptops & Notebooks')]")
	private WebElement showAllLapsNotesDropdown;
	
	//---------------SHOW ALL LAPTOPSNOTEBOOKS PAGE------------------------------
	
	@FindBy(xpath="//img[@title='HP LP3065']")
	private WebElement hpLaptopImage;
	
	@FindBy(xpath="//a[text()='HP LP3065']")
	private WebElement hpLaptopLink;
	
	@FindBy(xpath = "//a[text()='MacBook']") 
	private WebElement macBookLink;

	
	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement macBookImage;
	
	@FindBy(xpath="//img[@title='MacBook Air']")
	private WebElement macBookAirImage;
	
	@FindBy(xpath="//a[text()='MacBook Air']")
	private WebElement macBookAirLink;
	
	@FindBy(xpath="//img[@title='MacBook Pro']")
	private WebElement macBookProImage;
	
	@FindBy(xpath="//a[text()='MacBook Pro']")
	private WebElement macBookProLink;
	
	@FindBy(xpath="//img[@title='Sony VAIO']")
	private WebElement sonyVAIOImage;
	
	@FindBy(xpath="//a[text()='Sony VAIO']")
	private WebElement sonyVAIOLink;
	
	@FindBy(xpath="(//a[contains(text(),'Macs (0)')])[3]")
	private WebElement refineSearchMacs;
	
	@FindBy(xpath="(//a[contains(text(),'Windows (0)')])[3]")
	private WebElement refineSearchWindows;
	
	//button[@id='button-cart']
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement addToCartButton;
	
	@FindBy(xpath="//*[contains(text(), 'You have added')]")
	private WebElement successAlertMessage;
	
	
	@FindBy(xpath="//*[contains(text(), 'item(s)')]")
	private WebElement cartTotal;
	

	@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']\r\n")
	private WebElement cartButton;
	
	//remove from cart //i[@class='fa fa-times']
	@FindBy(xpath="//button[@title='Remove']")
	private WebElement removeFromCart;
	
	@FindBy(xpath="//*[contains(text(), 'item(s)')]")
	private WebElement emptyCart;
	
	
	
	
	
	
    @FindBy(xpath="(//i[@class='fa fa-exchange'])[2]")
	private WebElement productCompareButtonMacbook;
	
    @FindBy(xpath="(//i[@class='fa fa-exchange'])[3]")
    private WebElement productCompareButtonMAir;

    
    @FindBy(xpath="//*[contains(text(), 'Success')]") 
    private WebElement successAlertProductC;
    
    @FindBy(xpath="//a[normalize-space()='product comparison']")
    private WebElement productComLink;
    
    @FindBy(xpath="//table[@class='table table-bordered']")
    private WebElement productChart;
    
    		
    
    
    
    
    
    
    
    @FindBy(xpath="(//i[@class='fa fa-heart'])[6]")
    private WebElement heartIconWishList;
    
    @FindBy(xpath="//h2[contains(text(),'$2,000.00')]")
    private WebElement macBookProPrice;
    
   
    @FindBy(xpath="//*[contains(text(), 'create an account')]")
    private WebElement alertToLogin;
    
    
	
	
	public void clickOnLaptopsDropdown() {
		laptopNoteDropdown.click();
	}
	
	
	public void clickOnShowAllLaps() {
		showAllLapsNotesDropdown.click();
	}
	
	public void clickOnMacBook() {
		macBookImage.click();
	}
	
	
	public void clickOnaddToCartButton() {
		addToCartButton.click();
	}
	
	
	public boolean successMessageisPresent() {
		if(successAlertMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
	public boolean cartTotalMessage() {
		if(cartTotal.isDisplayed())
			return true;
		else
			return false;
	}
	
	public boolean emptyCartDisplayed() {
		if(emptyCart.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickOnCartButton() {
		cartButton.click();
	}
	
	public void clickOnRemove() {
		removeFromCart.click();
	}
	
	public void clickOnProductCompare() {
		productCompareButtonMacbook.click();
	}
	
	public void clickOnProductCompareAir() {
		productCompareButtonMAir.click();
	}
	
	
	public boolean successAlertProductMessage() {
		if(successAlertProductC.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickOnProductComLink() {
		productComLink.click();
	}
	
	public boolean productChart() {
		if(productChart.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	public void clickOnHeartIcon() {
		heartIconWishList.click();
	}
	
	public void clickOnMacBookPro() {
		macBookProLink.click();
	}
	
	
	public boolean macBookPriceDisplayed() {
		if(macBookProPrice.isDisplayed())
			return true;
		else
			return false;
	}
	
	public boolean alertToLoginDisplayed() {
		if(alertToLogin.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	
}
