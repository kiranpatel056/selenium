package SeleniumDemoPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test2 {
	String actualTitle="SAGAR";
	String expetedTitle="KIRAN";
	String actualName="Patel";
	String expetedName="Savsani";
	@Test
	public void test4()
	{
		
		Assert.assertEquals(actualTitle,expetedTitle);
		System.out.println("My Four Test Case");
		
	}
	@Test
	public void test5()
	{
		Assert.assertEquals(actualName, expetedName);
		System.out.println("My Five Test case");
	}
	@Test
	public void test6()
	{
		System.out.println("My six Test Case");
	}
}
