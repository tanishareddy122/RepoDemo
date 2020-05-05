package firsttestngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
 public WebDriver driver;

@BeforeTest
public void launchBrowser() {
	System.out.println("launching chrome browser"); 
	String driverpath= System.getProperty("user.dir")+"\\src\\Browser\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverpath);
	driver= new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours");
}
	
@Test
	public void verifyHomepageTitle() {
	String expectedTitle = "Welcome: Mercury Tours";
	String actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle, expectedTitle);
    
	}
@AfterTest
public void terminateBrowser(){
    driver.close();
}
}
