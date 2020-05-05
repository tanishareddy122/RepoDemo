package firsttestngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class firstTestNGFile {
	public WebDriver driver ;
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	@Test
	public void verifyHomepageTitle() {

		String driverpath=System.getProperty("user.dir")+"\\src\\Browser\\chromedriver.exe";
		System.setProperty( "webdriver.chrome.driver", driverpath);
		System.out.println("launching chrome browser"); 

		driver = new ChromeDriver();
		driver.get(baseUrl);
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
	}
	
}
