package SeleniumDemoPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArrayDemo12 {
		
	@DataProvider(parallel=true)
	public Object[][] getdata()
	{
		Object[][] obj=new Object[3][4];
		obj[0][0]="KIRAN";
		obj[0][1]=7486906;
		obj[0][2]="Noida";
		obj[0][3]=45961;
		obj[1][0]="SAGAR";
		obj[1][1]=74054;
		obj[1][2]="delhi";
		obj[1][3]=563225;
		obj[2][0]="VISHAL";
		obj[2][1]=74054;
		obj[2][2]="MUMBAi";
		obj[2][3]=563225;
		return obj;
	}
	@Test(dataProvider="getdata")
	public void dataTest(String name,int number,String add,int pin)
	{
		
	
	}

}

