package tests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.BaseTest;

public class SearchGoogleTest extends BaseTest {
	
  WebDriver driver ;	
  
  @BeforeTest
public void beforeTest(){
	 
	  System.out.println("Here came the preconditon");
  }
	
  @Test(priority = 1)
  public void SearchOnGoogleFactory() {
	  googleP.SearchOnGoogleFactory();
  }
  
  @Test(enabled = false, priority = 2)
  public void SearchOnGoogle() {
	  // WebDriverManager.chromedriver().setup();
	  //driver = new ChromeDriver();
	  //driver.manage().window().maximize();
	  //driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
	  
	  //driver.get("https://www.google.com/");
	  //GoogleSearchPage gsp = new GoogleSearchPage(driver);
	  //gsp.GoogleSearch();
	 // googleP.SearchOnGoogleFactory();
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("Here goes the tests postconditon");
	  //driver.close();
	  
  }
}
