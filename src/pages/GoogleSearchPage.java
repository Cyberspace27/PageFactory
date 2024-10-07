package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	
	WebDriver driver ;
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By elemeX = By.xpath("//input[@name='q']");
	
	By elemeY = By.id("APjFqb");
	
	public void GoogleSearch() {
		driver.findElement(elemeY).sendKeys("test");
	}
//	kjhkdshhfkhkdfhkdjkdhkf

}
