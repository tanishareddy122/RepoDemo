package firsttestngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
WebDriver driver;




@Test
public void testCaseVerifyHomepage() {
	String driverpath=System.getProperty("user.dir")+"\\src\\Browser\\chromedriver.exe";
	System.setProperty( "webdriver.chrome.driver", driverpath);
	
	System.out.println("launching chrome browser"); 

	driver = new ChromeDriver();
	driver.get("http://google.com");
	Assert.assertEquals("Goooogle", driver.getTitle(), "Title not matching");

}
}
