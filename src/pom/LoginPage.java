package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import browser.BaseTest1;

public class LoginPage extends BaseTest1 {
	

	@FindBy(xpath = "//input[@id='txtUsername']")private WebElement untb;
	@FindBy(xpath="//input[@id='txtPassword']") private WebElement pwd;
	@FindBy(xpath = "//input[@id='btnLogin']") private WebElement lgnbtn;
	
	
	public LoginPage() {
		PageFactory.initElements(BaseTest1.driver, this);
		
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
	public void setLgnbtn(WebElement lgnbtn) {
		lgnbtn.click();
	}
	
	public void loginORM(String un,String pw) throws Throwable {
		untb.sendKeys(un);
		Thread.sleep(2000);
		pwd.sendKeys(pw);
		Thread.sleep(2000);
		lgnbtn.click();
	}
}