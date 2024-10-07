package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class GoogleSearchFactoryPage extends BasePage{

	WebDriver driver ;
	public GoogleSearchFactoryPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(name = "q")
	public WebElement elementX ;
	
	@FindBy(id = "btnK")
	public WebElement elementY;
	
	public void SearchOnGoogleFactory() {
		elementX.sendKeys("test factory");
	}
}
