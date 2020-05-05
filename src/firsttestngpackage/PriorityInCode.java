package firsttestngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityInCode {
	WebDriver driver;

@Test
public void OpenBrowser() {
	String driverpath=System.getProperty("user.dir")+"\\src\\Browser\\chromedriver.exe";
	System.setProperty( "webdriver.chrome.driver", driverpath);
    driver= new ChromeDriver();

}
@Test	
public void launchBrowser() {
	driver.get("http://www.google.co.in");
}
@Test
public void performSearchAndClick1stLink() {
	driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook");
}
@Test		
public void FaceBookPageTitleVerification() throws Exception {				
    driver.findElement(By.xpath(".//*[@value='Search']")).click();		
    Thread.sleep(3000);		
    Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), true);				
}		
}	
