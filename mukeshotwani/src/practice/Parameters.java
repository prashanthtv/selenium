package practice;

public class Parameters 
{


	public static void main(String[] args)
	{
		
		Parameters obj1=new Parameters();
		obj1.add(10, 20);
		int sum=obj1.add(100, 200);
		System.out.println("sum is" + sum);
		
		//	obj1.sub(500, 200);
		
				}
	
		
		public int add(int a, int b)
		{
			int sum= a+b;
			return sum;
				
		}
		
		

		public void sub(int x, int y)
		{
			int z=x-y;
			System.out.println("Addion is:"+z);
		}

}
