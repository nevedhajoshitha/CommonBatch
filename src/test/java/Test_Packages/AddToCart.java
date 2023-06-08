package Test_Packages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	WebDriver driver;
	public AddToCart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'HP 15s, AMD Ryzen 5 5500U, 15.6 inch(39.6cm) FHD')]")
	WebElement Item;
	
	@FindBy(id = "add-to-cart-button")
	WebElement Cart;
	
	public void Select() {
		Item.click();
	}
	
	public void Add() {
		Cart.click();
	}
}
