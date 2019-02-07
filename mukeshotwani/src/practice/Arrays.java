package practice;

public class Arrays {

	public static void main(String[] args) {
		int employee_id[]=new int[4];
		employee_id[0]=10;
		employee_id[1]=20;
		employee_id[2]=30;
		employee_id[3]=40;
	
		int sizeofarray=employee_id.length;
		
		System.out.println(sizeofarray);
		
		
		for (int i=0; i<sizeofarray;i++)
			
		{
		System.out.println("Employeed id is " +employee_id[i]);
	}

}

}