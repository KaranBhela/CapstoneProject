package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base{

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchBar;
	
	@FindBy(xpath = "//button[@type='button' and @class='btn btn-default btn-lg']")
	private WebElement searchButton;
	
	
	@FindBy(xpath = "//img[@title='Apple Cinema 30']")
	private WebElement appleCinemaImage;
	
	@FindBy(xpath = "//a[text()='Apple Cinema 30\"']")
	private WebElement appleCinemaLink;
	

	@FindBy(xpath = "//img[@title='Canon EOS 5D']")
	private WebElement cannonEOSImage;
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
	private WebElement cannonEOSLink;
	
	
	@FindBy(xpath = "(//img[@alt='iPhone 6'])[2]")
	private WebElement iPhone6Image;
	
	@FindBy(xpath = "(//img[@alt='MacBookAir'])[2]")
	private WebElement macBookAirImage;
	
	
	//----------------LINKS ON BOTTOM OF PAGE-------------------
	@FindBy(xpath = "//a[(text()='About Us')]")
	private WebElement aboutUS;
	
	@FindBy(xpath = "//a[(text()='Delivery Information')]")
	private WebElement deliveryInfo;
	
	@FindBy(xpath = "//a[(text()='Privacy Policy')]")
	private WebElement privacyPolicy;
	
	@FindBy(xpath = "//a[(text()='Terms & Conditions')]")
	private WebElement termsConditions;
	
	@FindBy(xpath = "//a[(text()='Contact Us')]")
	private WebElement contactUs;
	
	@FindBy(xpath = "//a[(text()='Returns')]")
	private WebElement returns;
	
	@FindBy(xpath = "//a[(text()='Site Map')]")
	private WebElement siteMap;
	
	@FindBy(xpath = "//a[(text()='Brands')]")
	private WebElement brands;
	
	@FindBy(xpath = "//a[(text()='Gift Certificates')]")
	private WebElement giftCertificates;
	
	@FindBy(xpath = "//a[(text()='Affiliate')]")
	private WebElement affiliate;
	
	@FindBy(xpath = "//a[(text()='Specials')]")
	private WebElement specials;
	
	@FindBy(xpath = "//a[(text()='My Account')]")
	private WebElement myAccountLink;
	
	@FindBy(xpath = "//a[(text()='Order History')]")
	private WebElement orderHistory;
	
	@FindBy(xpath = "//a[(text()='Wish List')]")
	private WebElement wishList;
	
	@FindBy(xpath = "//a[(text()='Newsletter')]")
	private WebElement newsLetter;
	
	//-------------TOP OF PAGE ELEMENTS----------------------------
	
	@FindBy(xpath = "//span[(text()='Currency')]")
	private WebElement currency;
	
	@FindBy(xpath = "//button[(text()='€ Euro')]")
	private WebElement euroCurrency;
	
	
	@FindBy(xpath = "//strong[contains(text(),'€')]")
	private WebElement euroCurrencySign;
	
	@FindBy(xpath = "//button[(text()='£ Pound Sterling')]")
	private WebElement poundCurrency;
	
	@FindBy(xpath = "//button[(text()='$ US Dollar')]")
	private WebElement dollarCurrency;
	
	@FindBy(xpath = "//span[(text()='My Account')]")
	private WebElement myAccountDropdown;
	
	@FindBy(xpath = "//a[(text()='Register')]")
	private WebElement register;
	
	@FindBy(xpath = "//a[(text()='Login')]")
	private WebElement logIn;
	
	@FindBy(xpath = "//span[contains(text(),'Wish List')]")
	private WebElement wishListMenu;
	
	@FindBy(xpath = "//span[(text()='Shopping Cart')]")
	private WebElement shoppingCart;
	
	//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]
	@FindBy(xpath = "//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]")
	private WebElement emptyCartMessage;
	
	
	@FindBy(xpath = "//span[(text()='Checkout')]")
	private WebElement checkOut;	
	
	public void clickOnCurrency() {
		currency.click();
	}
	
	public void clickOnEuroCurrency() {
		euroCurrency.click();
	}
	
	public boolean euroSignisPresent() {
		if(euroCurrencySign.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickOnShoppingCart() {
		shoppingCart.click();
	}
	
	public boolean emptyCartSignisPresent() {
		if(emptyCartMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
}
