package SeleniumDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
	String title=driver.getTitle();
	System.out.println(title);
	driver.manage().window().maximize();
	//driver.findElement(By.id("email")).sendKeys(title);
	//driver.findElement(By.id("pass")).sendKeys("Password incorrect");
//	driver.findElement(By.linkText("developers")).click();
	driver.findElement(By.id("u_0_j")).sendKeys("Kiran");
	driver.findElement(By.name("lastname")).sendKeys("Sagar");
	driver.findElement(By.name("reg_email__")).sendKeys("8758728256");
	driver.findElement(By.name("reg_passwd__")).sendKeys("kavya056");
	driver.findElement(By.id("day")).sendKeys("17");
	driver.findElement(By.name("birthday_month")).sendKeys("Mar");
	driver.findElement(By.name("birthday_year")).sendKeys("1997");
	driver.findElement(By.id("u_0_9")).click();
	driver.findElement(By.name("websubmit")).click();
	}

}