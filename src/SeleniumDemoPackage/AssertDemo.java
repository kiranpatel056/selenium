package SeleniumDemoPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	String actualTitle="SAGAR";
	String expetedTitle="KIRAN";
	SoftAssert softassert=new SoftAssert();
	@Test
	public void method1()
	{
		System.out.println("Before Assert");
		softassert.assertEquals(actualTitle,expetedTitle);
		System.out.println("After Assert");
		softassert.assertAll();
	}
	

}
