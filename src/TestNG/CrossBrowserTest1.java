package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CrossBrowserTest1 extends CrossBrowserBase{
	@Test
	public void test1()
	{
		driver.get("https://www.selenium.dev/");
		WebElement logo=driver.findElement(By.id("Layer_1"));
		if(logo.isDisplayed())
		{
			System.out.println("selenium displayed");
		}
	}
}
