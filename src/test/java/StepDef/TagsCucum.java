package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TagsCucum {
	WebDriver driver;
	
	@Given("Chrome Browser is launched")
	public void chrome_browser_is_launched() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	}

	@Then("Open the google page")
	public void open_the_google_page() {
	   driver.get("https://www.google.com");
	}

	@Then("Close browser")
	public void close_browser() {
	    driver.close();
	}

	@Given("Edge browser is open")
	public void edge_browser_is_open() {
		 WebDriverManager.edgedriver().setup();
		   driver = new EdgeDriver();
		   driver.manage().window().maximize();
	}

	@Then("Open the facebook page")
	public void open_the_facebook_page() {
		driver.get("https://www.fb.com");
	}

	@Then("Browser is closed")
	public void browser_is_closed() {
	    driver.close();
	}



}
