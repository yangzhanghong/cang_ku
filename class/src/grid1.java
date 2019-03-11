import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class grid1 {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver;
		ChromeOptions options=new ChromeOptions();
		options.addArguments("D:\\chromedriver.exe");
		DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY,options);
		driver=new RemoteWebDriver(new URL("http://192.168.43.165:4444/wd/hub"),capabilities);
		driver.get("https://www.baidu.com");
	}

}
