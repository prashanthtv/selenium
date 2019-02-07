package practice;

public class PassParameters {

	public static void main(String[] args) {
		
        
		PassParameters obj1=new PassParameters();
		obj1.add(50, 40);
		obj1.sub(100.5, 50.3);
	
	}

	
	public void add (int a, int b)
	
	{
		int c=a+b;
		
		System.out.println("The addtion of 2 numbers is " +c);
		
	}
	
	public void sub(double x, double y)
	{
		double result = x-y;
		System.out.println("The subraction of 2 numbers is " +result);
	}
	
	
	
}
