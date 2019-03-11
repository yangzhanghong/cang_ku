import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class grid {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver;
		ProfilesIni allProfiles=new ProfilesIni();
		FirefoxProfile profile=allProfiles.getProfile("default");
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		driver=new RemoteWebDriver(new URL("http://192.168.43.165:4444/wd/hub"),capabilities);
		driver.get("https://www.baidu.com");
	}

}
