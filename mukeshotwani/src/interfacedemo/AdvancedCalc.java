package interfacedemo;

public class AdvancedCalc  implements calc {

	public static void main(String[] args) {
		
		 
		
		AdvancedCalc obj1=new AdvancedCalc();
		
		obj1.add();
		obj1.sub();
		obj1.mul();
		obj1.divide();
		obj1.calculatesin();
		 

	}

	 
public void calculatesin()
{
	
	System.out.println("Im in addvanced calc - Sine theta method");
}
	
	
	public void add() {
		
		System.out.println("Im in add method");
	
		
	}

	 
	public void sub() {
		
		System.out.println("Im in subtract method");
	}

	 
	public void mul() {
		System.out.println("Im in multipicattion method");
		
	}


	@Override
	public void divide() {
		
		
	}

}
