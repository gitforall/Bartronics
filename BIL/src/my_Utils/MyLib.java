package my_Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.WrapsDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public abstract class MyLib {

	public static void pageloadingtime(WebDriver driver, String url) {

		long start = System.currentTimeMillis();
		driver.get(url);
		long finish = System.currentTimeMillis();
		long totalTime = finish - start;
		System.out.println("Total Time for page load - " + totalTime);
	}

	public static void send(WebElement element, String attributeName, String value)
	{
		WrapsDriver wrappedElement = (WrapsDriver) element;
		JavascriptExecutor driver = (JavascriptExecutor)wrappedElement.getWrappedDriver();
		driver.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", element, attributeName, value);

	}
	
	public static void takeScreenShotWhenAssetFail(WebDriver driver , String imgPath) throws IOException{
		
		EventFiringWebDriver eDriver=new EventFiringWebDriver(driver);
		 
		File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
		 
		FileUtils.copyFile(srcFile, new File(imgPath));
		
		/*File sc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File(""));*/
		
	}
	


		public static void https(WebDriver driver){

		FirefoxProfile profile = new FirefoxProfile();

		profile.setAcceptUntrustedCertificates(false);

		driver = new FirefoxDriver(profile);
		
		WebElement ele = driver.findElement(By.id(""));
	//	Actions act = new Actions(driver);
		ele.sendKeys(Keys.ENTER);

		driver.get("url");

		}

	public static void doubleclick(WebDriver driver , WebElement ele) {
		
		Actions act = new Actions(driver);

		act.doubleClick(ele);
		
		act.sendKeys(ele , Keys.chord(Keys.CONTROL,"a")).perform();;
		
		String press = Keys.chord(Keys.SHIFT,Keys.ENTER);

		ele.sendKeys(press);
	}
		
}
