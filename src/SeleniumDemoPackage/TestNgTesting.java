package SeleniumDemoPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgTesting 
{
	@Test(priority=1)
	public void z()
	{
		System.out.println("Testing A");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before Test");
	}
	@Test(priority=2)
	public void g()
	{
		System.out.println("Testing B");
	}
	@Test(priority=3)
	public void j()
	{
		System.out.println("Testing C");
	}
	@Test(priority=4)
	public void d()
	{
		
		System.out.println("Testing D");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("After Test");
}

}
