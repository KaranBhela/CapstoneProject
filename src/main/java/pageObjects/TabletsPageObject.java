package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TabletsPageObject extends Base{
	
	public TabletsPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[text()='Tablets']")
	private WebElement tabletsTab;
	
	
	@FindBy(xpath="//img[@title='Samsung Galaxy Tab 10.1']")
	private WebElement samGalaxyTabImage;
	
	@FindBy(xpath="//a[(text()='Samsung Galaxy Tab 10.1')]")
	private WebElement samGalaxyTabLink;
	
	
}
