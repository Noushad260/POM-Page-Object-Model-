package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CroseBrowserTest2 extends CrossBrowserBase {
	@Test
	public void test1()
	{
		driver.get("https://www.swiggy.com/");
		WebElement logo=driver.findElement(By.xpath("//*[name()='svg'][@class=\"_1envo\"]"));
		if(logo.isDisplayed())
		{
			System.out.println("swiggy displayed");
		}
	}
}
