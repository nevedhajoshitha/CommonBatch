package Object_Package;

import java.util.Iterator;
import java.util.Set;

import Base_Package.Base_Class;
import Test_Packages.AddToCart;
import Test_Packages.SearchPage;

public class Main extends Base_Class {
public static void main(String[] args) throws InterruptedException {
	Setup();
	SearchPage s = new SearchPage(driver);
	s.SearchText();
	s.Click();
	Thread.sleep(2000);
	AddToCart a = new AddToCart(driver);
	a.Select();
	Set<String> str = driver.getWindowHandles();
	Iterator< String> it = str.iterator();
	String main = it.next();
	String child = it.next();
	driver.switchTo().window(child);
	a.Add();
	Thread.sleep(2000);
	TearDown();
}
}
