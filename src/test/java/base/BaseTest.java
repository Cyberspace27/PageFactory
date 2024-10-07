package base;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import pages.GoogleSearchFactoryPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {
  
	
	private WebDriver driver;
	public GoogleSearchFactoryPage googleP ;
	
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://google.com");
		googleP = new GoogleSearchFactoryPage(driver);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("headless", "false"); // 
      String headless = System.getProperty("headless");

      ChromeDriverManager.chromedriver();
      if("true".equals(headless)) {
          ChromeOptions chromeOptions = new ChromeOptions();
          chromeOptions.addArguments("--headless");
          driver = new ChromeDriver(chromeOptions);
      } else {
          driver = new ChromeDriver();
      }
  }

  @AfterSuite
  public void afterSuite() {
	  
	  if(null != driver) {
          //  driver.close();
            driver.quit();
        }
  }

}
