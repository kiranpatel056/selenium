package SeleniumDemoPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Test1 {
	@Test(dependsOnMethods="test2")
	public void test1()
	{
		System.out.println("My First Test case");
	}
	@Test
	public void test2() throws Exception
	{
		System.out.println("My Second Test case");
		throw new SkipException("message");
	
	}
	@Test
	public void test3()
	{
		System.out.println("My Three Test Case");
	}
}
