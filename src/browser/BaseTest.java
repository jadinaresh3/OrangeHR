package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import tests.FileLib;

public class BaseTest {
	
	public static WebDriver driver;
	
		
		public void openBrowser() throws Throwable {
			
			FileLib flib = new FileLib();
			String browser = flib.ReadPropData("./data/config.properties", "browser");
			System.out.println(browser);
			if(browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeOptions co = new ChromeOptions();
				co.addArguments("start-maximized");
				driver = new ChromeDriver(co);
			}
			else if(browser.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				ChromeOptions co = new ChromeOptions();
				co.addArguments("start-maximized");
				driver = new FirefoxDriver();
				
			}
			String appurl = flib.ReadPropData("./data/config.properties", "url");
			driver.get(appurl);		
		
	}

}
