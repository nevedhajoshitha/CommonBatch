package StepDef;

import org.openqa.selenium.By;

import Base_Package.Base_Class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends Base_Class{
	@Given("Google is open")
	public void google_is_open() {
	   Setup("https://www.google.com");
	}

	@When("^User enters a (.*) to search$")
	public void user_enters_a_text_to_search(String s) throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys(s);
		Thread.sleep(2000);
	   	}

	@When("Click on Search button")
	public void click_on_search_button() throws InterruptedException {

		driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		}

	@Then("Close the browser")
	public void close_the_browser() {
		TearDown();

	}

}
