package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import browser.BaseTest;

public class LoginPOM extends BaseTest{
	
	@FindBy(xpath = "//input[@id='txtUsername']")private WebElement untb;
	@FindBy(xpath="//input[@id='txtPassword']") private WebElement pwd;
	@FindBy(xpath = "//input[@id='btnLogin']") private WebElement lgnbtn;
	
	public LoginPOM() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getUntb() {
		return untb;
	}

	public void setUntb(String un) {
		untb.sendKeys(un);
	}

	public WebElement getPwd() {
		return pwd;
	}

	public void setPwd(String pw) {
		pwd.sendKeys(pw);
	}

	public WebElement getLgnbtn() {
		return lgnbtn;
	}

	public void setLgnbtn() {
		lgnbtn.click();
		
	}
	
	public void LgnOrm(String un,String pw) {
		untb.sendKeys(un);
		pwd.sendKeys(pw);
		lgnbtn.click();
	}
}
