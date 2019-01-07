package SeleniumDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook1 {
	public static void main(String args[])throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Select drpday=new Select(driver.findElement(By.name("birthday_day")));
		drpday.selectByIndex(17);
		Thread.sleep(6000);
		Select drpmonth=new Select(driver.findElement(By.name("birthday_month")));
		drpmonth.selectByVisibleText("Mar");
		Select drpyear=new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		drpyear.selectByVisibleText("1997");
		
	}

}
