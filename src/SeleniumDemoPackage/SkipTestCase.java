package SeleniumDemoPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestCase {

	@Test
	public void testone()
	{
		System.out.println("My First Test case");
	}
	@Test
	public void testtwo() throws Exception
	{
		System.out.println("My Second Test case");
		throw new SkipException("message");
	}
	@Test(dependsOnMethods="testtwo")
	public void testthree()
	{
		System.out.println("My Third Test case");
	}
	@Test
	public void testfour()
	{
		System.out.println("My Fourth Test case");
	}
}
