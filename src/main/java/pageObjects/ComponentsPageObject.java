package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentsPageObject extends Base{
	public ComponentsPageObject() {
		PageFactory.initElements(driver, this);
		
	}
	
		@FindBy(xpath="//a[text()='Components']")
		private WebElement componentsDropdown;
		
		@FindBy(xpath="//a[contains(text(),'Mice and Trackballs')]")
		private WebElement mTrackballsDropdown;
		
		@FindBy(xpath="//a[(text()='Monitors (2)')]")
		private WebElement monitorsDropdown;
		
		@FindBy(xpath="//a[(text()='Printers (0)')]")
		private WebElement printersDropdown;
		
		@FindBy(xpath="//a[(text()='Scanners (0)')]")
		private WebElement scannersDropdown;
		
		@FindBy(xpath="//a[(text()='Web Cameras (0)')]")
		private WebElement webCamerasDropdown;
		
		@FindBy(xpath="//a[contains(text(),'Show All Components')]")
		private WebElement showAllComponents;
		
	//--------------------------------------------------------------------------------Monitors page
		
		@FindBy(xpath="//a[contains(text(),'test 1 (0)')]")
		private WebElement test1link;
		
		@FindBy(xpath="//a[(text()='test 2 (0)')]")
		private WebElement test2link;
		
		@FindBy(xpath="//a[@id='compare-total']")
		private WebElement productCompare;
		
		//link when clicking on product image
		@FindBy(xpath="//img[@title='Apple Cinema 30\"']")
		private WebElement appleCinemaImage;
		//link when clicking on the product title 
		@FindBy(xpath="//a[(text()='Apple Cinema 30\"')]")
		private WebElement appleCinemaLink;
		//link when clicking on product image
		@FindBy(xpath="//img[@title='Samsung SyncMaster 941BW']")
		private WebElement samsungSyncImage;
		//link when clicking on the product title
		@FindBy(xpath="//a[(text()='Samsung SyncMaster 941BW')]")
		private WebElement samsungSyncLink;
		
		
		@FindBy(xpath="(//button[@type='button'])[12]")
		private WebElement addToCartSamsung;
		
		@FindBy(xpath="(//button[@type='button'])[13]")
		private WebElement addtoWishListSamsung;
		
		@FindBy(xpath="(//button[@type='button'])[12]")
		private WebElement compareAppleButton;
		
		@FindBy(xpath="(//button[@type='button'])[15]")
		private WebElement compareSamsungButton;
}

