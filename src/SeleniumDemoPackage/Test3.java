package SeleniumDemoPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Test3 {
	@Test
	public void test7()
	{
		System.out.println("My Seven Test case");
	}
	@Test
	public void test9() throws Exception
	{
		System.out.println("My Nine Test case");
		throw new SkipException("message");
	
	}
	@Test
	public void test8()
	{
		System.out.println("My Eight Test Case");
	}

}
