package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicBforeAfter {

	public class LoginPage {
		@Test
		public void Validatevideeo()
		{
			System.out.println("video validate successfully");
		}
		@BeforeSuite
		public void vmconnection()
		{
			System.out.println("Virtual machine setup has been innociated");
		}
		@BeforeTest
		public void dataconnection()
		{
			System.out.println("Data base connection has been inniciated");
		}
		@BeforeClass
		public void launchbrowser()
		{
			System.out.println("Browser launch successfully");
		}
		@BeforeMethod
		public void loginapp()
		{
			System.out.println("Login successfully");
		}
		
		@Test
		public void Validatechat()
		{
			System.out.println("chat validate successfully");
		}
		
		@AfterMethod
		public void logout()
		{
			System.out.println("lougout successfully");
		}
		@AfterClass
		public void closebrowser()
		{
			System.out.println("closebrowser successfully");
		}
		
		@AfterTest
		public void closedbconnection()
		{
			System.out.println("closedbconnection successfully");
		}
		@AfterSuite
		public void closevmconnection()
		{
			System.out.println("closevmconnection successfully");
		}
		@Test
		public void Validatelogo()
		{
			System.out.println("logo validated successfully");
		}
	
	
	
}
}
