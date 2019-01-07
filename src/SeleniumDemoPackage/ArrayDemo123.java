package SeleniumDemoPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArrayDemo123 {

	@DataProvider
	public Object[][] getdata()
	{
		Object[][] obj=new Object[5][5];
		obj[0][0]="Ghetia";
		obj[0][1]="Kiran";
		obj[0][2]=748686;
		obj[0][3]="Noida";
		obj[0][4]=1731997;
		obj[1][0]="Savsani";
		obj[1][1]="Sagar";
		obj[1][2]=7405450;
		obj[1][3]="Delhi";
		obj[1][4]=31121993;
		obj[2][0]="Ghetia";
		obj[2][1]="Hetvi";
		obj[2][2]=8752835;
		obj[2][3]="Baroda";
		obj[2][4]=2832007;
		obj[3][0]="Patel";
		obj[3][1]="Kavya";
		obj[3][2]=748785;
		obj[3][3]="Ahmedabad";
		obj[3][4]=992012;
		obj[4][0]="Shah";
		obj[4][1]="Vishal";
		obj[4][2]=748926;
		obj[4][3]="mumbai";
		obj[4][4]=3052003;
		return obj;
	}
	@Test(dataProvider="getdata")
	public  void getText(String fname,String lname,int num,String add,int date)
	{
		
	}
}
