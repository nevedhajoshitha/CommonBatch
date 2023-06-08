package TestNGFramework;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base_Package.Base_Class;

public class Browser extends Base_Class{
	@BeforeClass
	public void Open() {
		Setup("https://www.google.com");
	}
	
	@DataProvider(name = "testdata")
	public Object[][] data(){
		return new Object[][] {{"Selenium"} };
	}
	
	@Test(dataProvider = "testdata" )
	public void Google(String str) throws InterruptedException {
			
		String actual = driver.getTitle();
		String expected = "Good";
		//Assert.assertEquals(actual, expected, "this is not a  match");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		driver.findElement(By.name("q")).sendKeys(str);
		Thread.sleep(2000);
		sa.assertAll();
	}
		
		
	@AfterClass
	public void Close() {
		TearDown();
	}
}
