package SeleniumDemoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		List<WebElement> list =driver.findElements(By.tagName("a"));
		
		System.out.println("Your links are"+list.size());
		for(WebElement links:list) {
			System.out.println(links.getAttribute("href"));
		System.out.println(links.getText());
		}
	}

}
