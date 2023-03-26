package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class CrossBrowserBase {
    WebDriver driver;
	@Parameters("Browser")
	@BeforeMethod
	public void methodsetup(String Browser)
	{
		switch(Browser)
		{
		case"Chrome":ChromeOptions options=new ChromeOptions();
		             options.addArguments("--remote-allow-origins=*");
		             driver=new ChromeDriver(options);
		             break;
		             
		case"FireFox":driver=new FirefoxDriver();
		             break;
		case"Edge":driver=new EdgeDriver();
		             break;
		default:System.out.println("invalid browser");
		
		 }
	}

	@AfterMethod
	public void methodTeardown()
	{
		driver.quit();
	}
}
