package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
@FindBy(css="input[data-test='firstName']")
WebElement firstName;
@FindBy(css="input[data-test='lastName']")
WebElement lastName;
@FindBy(css="input[data-test='postalCode']")
WebElement postalCode;
@FindBy(css="button[data-test='continue']")
WebElement contBtn;
@FindBy(css="button[data-test='finish']")
WebElement finishBtn;
@FindBy(css="h2.complete-header")
WebElement successMsg;
public CheckOutPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void provideDetails(String strfName,String strlName,String Pcode)
{
	firstName.sendKeys(strfName);
	lastName.sendKeys(strlName);
	postalCode.sendKeys(Pcode);
	contBtn.click();
}
public void Checkoutorder()
{
	finishBtn.click();
	
}
public boolean isOrderSucess()
{
	return successMsg.isDisplayed();
}
}
