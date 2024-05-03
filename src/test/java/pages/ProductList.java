package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductList {
@FindBy(id="add-to-cart-sauce-labs")
WebElement itemone;
@FindBy(id="add-to-cart-sauce-labs")
WebElement itemtwo;
@FindBy(id="shopping-cart-container")
WebElement cartIcon;
@FindBy(xpath="//span[contains(text(),'Products')")
WebElement productsTitle;
public ProductList(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void addToCart()
{
itemone.click();
itemtwo.click();
}
public void ViewCart() {
	
	cartIcon.click();
}
	public  boolean isOnProducts()
	{
		return productsTitle.isDisplayed();
	}
}


