package SeleniumDemoPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement empid=driver.findElement(By.name("cusid"));
		empid.sendKeys("12346");
		WebElement button=driver.findElement(By.name("submit"));
		button.click();
		Alert obj=driver.switchTo().alert();
		Thread.sleep(6000);
		obj.accept();
		System.out.println(obj.getText());
		
	}

}
