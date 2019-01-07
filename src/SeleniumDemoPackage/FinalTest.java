
package SeleniumDemoPackage;

class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int j=20;j<=30;j++)
		{
			System.out.println(j);
		}
	}
}
public class FinalTest {

	public static void main(String[] args) {
		
		A obj=new A();
		B obj1=new B();
		obj.start();
		obj1.run();

	}

}
