package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonePDAsPageObject extends Base{
	
	public PhonePDAsPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='Phones & PDAs']")
	private WebElement phonesPDAsTab;
	
	@FindBy(xpath="//img[@title='HTC Touch HD']")
	private WebElement htcTouchHDImage;
	
	@FindBy(xpath="//a[text()='HTC Touch HD']")
	private WebElement htcTouchHDLink;
	
	@FindBy(xpath="//img[@title='iPhone']")
	private WebElement iPhoneImage;
	
	@FindBy(xpath="//a[text()='iPhone']")
	private WebElement iPhoneLink;
	
	@FindBy(xpath="//img[@title='Palm Treo Pro']")
	private WebElement palmTreoProImage;

	@FindBy(xpath="//a[text()='Palm Treo Pro']")
	private WebElement palmTreoProLink;

}
