package TestNGFramework;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerClass.class)
public class SampleTest {
	@BeforeSuite
	public void bs() {
		System.out.println("Before suite");
	}
	
	@AfterSuite
	public void as() {
		System.out.println("After suite");
	}
	
	@BeforeClass
	public void bc() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public void ac() {
		System.out.println("After class");
	}
	
	@BeforeTest
	public void bt() {
		System.out.println("Before test");
	}
	
	@AfterTest
	public void at() {
		System.out.println("After test");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("After Method");
	}
	
	@Test(invocationCount = 3, groups = {"Regression"}, dependsOnGroups = {"unit"})
	public void TC1() {
		System.out.println("First test");
	}
	
	@Test(groups = {"unit"})
	public void TC2() {
		System.out.println("Second test");
	}
	
	@Test(priority = -3, groups = {"regression"})
	public void TC3() {
		throw new SkipException("skipped");
		//System.out.println("Third test");
	}
}
