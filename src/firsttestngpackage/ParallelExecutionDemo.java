package firsttestngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecutionDemo {
	WebDriver driver;
	String driverpath;
	@Parameters("browser")
	@BeforeClass
	public void launchBrowser(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")){
			 driverpath= System.getProperty("user.dir")+ "\\src\\Browser\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",driverpath);
			driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			String driver_path= System.getProperty("user.dir")+ "\\src\\Browser_drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver",driver_path);
			driver= new FirefoxDriver();
		}
	}
	
	@Test
	public void loginFunction() {
		driver.get("https://www.facebook.com");
	}
}


