package SeleniumDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgLogin {
	WebDriver driver;
	String url="https://www.facebook.com/";
	@BeforeTest
	public void start()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();

	}
	@BeforeMethod
	public void launch()
	{
		driver.get(url);

	}
	@Test
	public void login()
	{
		driver.findElement(By.id("email")).sendKeys("patelkj17@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("kiransagar");
		//System.out.println("Login success");
	}
	@AfterMethod
	public void stop1()
	{
		driver.close();
	}
	@Test
		public void registration()
		{
		driver.findElement(By.name("firstname")).sendKeys("Kiran");
		driver.findElement(By.name("lastname")).sendKeys("Ghetia");

		}
	
	@AfterTest
	public void stop()
	{
		driver.close();
	}
}
