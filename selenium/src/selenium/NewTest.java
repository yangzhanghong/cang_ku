package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	WebDriver driver;
	@Test
	public void f() {
		driver.get("https://www.baidu.com");
	}
	  
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.firefox.bin","D:\\seesighting\\Firefox\\firefox.exe");
		driver=new FirefoxDriver();
	}

  @AfterMethod
  public void afterMethod() {
  }

}
