package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//Locate allDOMS
	@FindBy(id="user-name")
	WebElement userName;
	@FindBy(id="password")
	WebElement pswd;
	@FindBy(id="login-button")
	WebElement loginBtn;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public LoginPage(String strUser,String strpswd) {
		userName.sendKeys(strUser);
		pswd.sendKeys(strpswd);
		loginBtn.click();
	}
	
}
