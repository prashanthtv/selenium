package practice;

public class PassParameters2 {

	public static void main(String[] args) {
		
        
		PassParameters2 obj1=new PassParameters2();
		int sum=obj1.add(50,40);
		
		System.out.println("The sum of two numbers is "+sum);
		double result=obj1.sub(100.5, 50.3);
		System.out.println("The differrence of two nunbers is "+result);
	
	}

	
	public int add (int a, int b)
	
	{
		int c=a+b;
		return c;
		
		//System.out.println("The addtion of 2 numbers is " +c);
		
	}
	
	public double sub(double x, double y)
	{
		double result = x-y;
		return result ;
	}
	
	
	
}
