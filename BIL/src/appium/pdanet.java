
package Android;

import io.appium.java_client.AppiumDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class pdanet {


	WebDriver driver;

	@Test
	public void testApp() throws MalformedURLException, InterruptedException{
	File app = new File("D:\\H\\Mobile_testing\\apk_files\\com.pdanet.apk");

	// java
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	capabilities.setCapability("deviceName", "Hari");
	capabilities.setCapability("platformVersion", "4.4.2");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("app", app.getAbsolutePath());

	capabilities.setCapability("appPackage", "com.pdanet");
	capabilities.setCapability("appActivity", "com.foxfi.HotspotSettings");
    
    driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}}

