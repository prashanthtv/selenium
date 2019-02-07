package practice;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList obj1=new ArrayList();
		obj1.add(75);
		obj1.add("prashanth");
		obj1.add("prashanth");
		obj1.add("P");
		obj1.add("13.324");
		obj1.remove(0);
		//obj1.get(1);
		System.out.println(obj1);
		//System.out.println(obj1.get(0));
		
int myarraysize=obj1.size();
		
		for(int i=0;i<myarraysize;i++)
		{
		System.out.println(obj1.get(i));
		
	}

}
}
