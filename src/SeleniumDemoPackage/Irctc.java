package SeleniumDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Irctc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement element=driver.findElement(By.cssSelector("body > app-root > app-home > app-header > div.h_container > div.h_main_div > div.h_head2 > nav > ul > li:nth-child(6) > a"));
		Actions actions=new Actions(driver);
		actions.moveToElement(element).build().perform();
		WebElement element1=driver.findElement(By.cssSelector("body > app-root > app-home > app-header > div.h_container > div.h_main_div > div.h_head2 > nav > ul > li:nth-child(6) > ul > li:nth-child(2) > a > span"));
		element1.click();
	}

}

