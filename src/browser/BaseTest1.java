package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import genericLib.FileLib;
import genericLib.IAutoConstant;

public class BaseTest1 implements IAutoConstant {
	
	public static WebDriver driver;
	
	
	public void OpenBrowser() throws Throwable {
		FileLib flib = new FileLib();
		String browser = flib.readPropData(PROP_PATH, "browser");
		if(browser.equals("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			ChromeOptions co = new ChromeOptions();
			co.addArguments("start-maximized");
			driver = new ChromeDriver(co);
		}
		else if(browser.equals("firefox")) {
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			ChromeOptions co = new ChromeOptions();
			co.addArguments("start-maximized");
			driver=new FirefoxDriver();
			
		}
		
		String appurl = flib.readPropData(PROP_PATH, "url");
		driver.get(appurl);
	}

}
