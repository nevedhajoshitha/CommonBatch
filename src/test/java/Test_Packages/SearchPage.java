package Test_Packages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
WebDriver driver;
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement Text;
	
	@FindBy(id = "nav-search-submit-button")
	WebElement Button;
	
	public void SearchText() {
		Text.sendKeys("Laptop");
	}
	
	public void Click() {
		Button.click();
	}
	
}
