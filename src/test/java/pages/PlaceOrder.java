package pages;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;

import base.TestBase;

public class PlaceOrder {
WebDriver driver;
LoginPage loginpage;
public PlaceOrder() {
	TestBase.initDriver();
	driver=TestBase.getDriver();
	loginpage=new LoginPage(loginpage);
	
}
public void setup() {
		TestBase.openUrl("https://www.saucedemo.com");
		
}
public void addITem() {
	listPage.add
}

public void validLogin() {
	loginpage.loginBtn;
}
}
