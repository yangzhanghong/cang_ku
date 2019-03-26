package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baidu {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin","D:\\seesighting\\Firefox\\firefox.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.baidu.com/");
		driver.findElement(By.id("kw")).sendKeys("selenium");
		driver.findElement(By.linkText("百度一下")).click();
		driver.close();
	}

}
