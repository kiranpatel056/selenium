package SeleniumDemoPackage;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList obj=new ArrayList();
		obj.add("KIRAN");
		obj.add(1);
		obj.add(2.5);
		obj.add("SAGAR");
		System.out.println("Your data are= "+obj);
		obj.remove(2);
		System.out.println("Your data are= "+obj);
		obj.addAll(obj);
		System.out.println("Your data are= "+obj);
		obj.removeAll(obj);
		System.out.println("Your data are= "+obj);

	}

}
