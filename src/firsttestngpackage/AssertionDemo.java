package firsttestngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
public	WebDriver driver;
	SoftAssert sa= new SoftAssert();
	
	@Test
	
	public void launchBrowser() {
		String driverpath=System.getProperty("user.dir")+"\\src\\Browser\\chromedriver.exe";
		System.setProperty( "webdriver.chrome.driver", driverpath);
		System.out.println("launching chrome browser"); 

		driver.get("https://www.facebook.com");
	}
	@Test
	public void verifyTitle() {
		String expTitle= "https://www.facebook.com";
		String ActualTitle= driver.getTitle();
		//hardassertion donot perform end to end execution
		System.out.println("Start");
		Assert.assertEquals(expTitle, ActualTitle);
		System.out.println("end");
	}
		//if(expTitle.equals(ActualTitle)) {
			//System.out.println("Title is matched");}
		//else {
		//	System.out.println("Title is not matched");
		//}
	@Test
	public void verifyTitlewithSoftAssertion() {//soft performs end to end execution;
		String expTitle= "https:// www.facebook.com";
		String ActualTitle= driver.getTitle();
		sa.assertEquals(expTitle, ActualTitle);
		System.out.println("end");
		sa.assertAll();	//	object is called to perform execution and it should be last statement.
	}
}

	





