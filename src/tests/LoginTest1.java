package tests;

import browser.BaseTest1;
import pom.LoginPage;

public class LoginTest1 extends BaseTest1 {
	
	public static void main(String[] args) throws Throwable {
		BaseTest1 bt = new BaseTest1();
		bt.OpenBrowser();
		
		FileLib flib = new FileLib();
		String un = flib.ReadPropData(PROP_PATH, "username");
		String pw = flib.ReadPropData(PROP_PATH, "password");
		
		LoginPage lp = new LoginPage();
		lp.loginORM(un, pw);
	}

}
