package tests;

import browser.BaseTest;
import pom.LoginPOM;

public class LoginTest {

	public static void main(String[] args) throws Throwable {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		LoginPOM lp = new LoginPOM();
		lp.LgnOrm("Admin", "admin123");
		
	}

}
