package SeleniumDemoPackage;

class EncapsulationDemo
{
	private int empsal;
	private String empname;
	public int emp_sal()
	{
		return empsal;
	}
	public String emp_name()
	{
		return empname;
		
	}
	public int getemp_sal(int sal)
	{
		return empsal=sal;
	}
	public String getemp_name(String name)
	{
		return empname=name;
	}
}
	public class Encapsulation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationDemo obj=new EncapsulationDemo();
		obj.getemp_sal(50000);
		obj.getemp_name("SAGAR");
		int a=obj.emp_sal();
		String b=obj.emp_name();
		System.out.println(a);
		System.out.println(b);
		
	}

}