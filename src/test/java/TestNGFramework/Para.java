package TestNGFramework;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base_Package.Base_Class;

public class Para extends Base_Class {
@BeforeMethod
public void Open() {
	Setup("https://www.google.com");
}

@AfterMethod
public void Close() {
	TearDown();
}

@DataProvider(name = "testdata")
public Object[][] data(){
	return new Object[][] {{"selenium"},{"testng"},{"cucumber"} };
	
}

@Test(dataProvider = "testdata")

public void Search(String str) throws InterruptedException {
	driver.findElement(By.name("q")).sendKeys(str);
	Thread.sleep(2000);
	driver.findElement(By.name("btnK")).click();
	Thread.sleep(2000);
	Reporter.log("The test case is executed");
}
}
