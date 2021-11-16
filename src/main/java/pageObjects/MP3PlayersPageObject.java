package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class MP3PlayersPageObject extends Base {
	
	public MP3PlayersPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='MP3 Players']")
	private WebElement mp3Dropdown;
	
	@FindBy(xpath="//a[text()='test 11 (0)']")
	private WebElement test11Dropdown;
	
	@FindBy(xpath="//a[text()='test 12 (0)']")
	private WebElement test12Dropdown;
	
	@FindBy(xpath="//a[text()='test 15 (0)']")
	private WebElement test15Dropdown;
	
	@FindBy(xpath="//a[text()='test 16 (0)']")
	private WebElement test16Dropdown;
	
	@FindBy(xpath="//a[text()='test 17 (0)']")
	private WebElement test17Dropdown;
	
	@FindBy(xpath="//a[text()='test 18 (0)']")
	private WebElement test18Dropdown;
	
	@FindBy(xpath="//a[text()='test 19 (0)']")
	private WebElement test19Dropdown;
	
	@FindBy(xpath="//a[text()='test 20 (0)']")
	private WebElement test20Dropdown;
	
	@FindBy(xpath="//a[text()='test 21 (0)']")
	private WebElement test21Dropdown;
	
	@FindBy(xpath="//a[text()='test 22 (0)']")
	private WebElement test22Dropdown;
	
	@FindBy(xpath="//a[text()='test 23 (0)']")
	private WebElement test23Dropdown;
	
	@FindBy(xpath="//a[text()='test 24 (0)']")
	private WebElement test24Dropdown;
	
	@FindBy(xpath="//a[text()='test 4 (0)']")
	private WebElement test4Dropdown;
	
	@FindBy(xpath="//a[text()='test 5 (0)']")
	private WebElement test5Dropdown;
	
	@FindBy(xpath="//a[text()='test 6 (0)']")
	private WebElement test6Dropdown;
	
	@FindBy(xpath="//a[text()='test 7 (0)']")
	private WebElement test7Dropdown;
	
	@FindBy(xpath="//a[text()='test 8 (0)']")
	private WebElement test8Dropdown;
	
	@FindBy(xpath="//a[text()='test 9 (0)']")
	private WebElement test9Dropdown;
	
	@FindBy(xpath="//a[(text()='iPod Classic')]")
	private WebElement iPodClassicLink;
	
	@FindBy(xpath="//img[@title='iPod Classic']")
	private WebElement iPodClassicImage;
	
	@FindBy(xpath="//a[text()='iPod Nano']")
	private WebElement iPodNanoLink;
	
	@FindBy(xpath="//img[@title='iPod Nano']")
	private WebElement iPodNanoImage;
	
	@FindBy(xpath="//a[text()='iPod Shuffle']")
	private WebElement iPodShuffleLink;
	
	@FindBy(xpath="//img[@title='iPod Shuffle']")
	private WebElement iPodShuffleImage;
	
	@FindBy(xpath="//a[text()='iPod Touch']")
	private WebElement iPodTouchLink;
	
	@FindBy(xpath="//img[@title='iPod Touch']")
	private WebElement iPodTouchImage;
		
}
