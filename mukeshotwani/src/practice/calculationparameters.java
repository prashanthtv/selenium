package practice;

public class calculationparameters {

	public static void main(String[] args) {
		
		DynamicCalculator obj1=new DynamicCalculator();
		int sum=obj1.add(50, 40);
		double sub=obj1.sub(20.2, 4.5);
		int multiply=obj1.mult(20, 6);
		double division=obj1.Div(21.0, 2.0);
		System.out.println("The Addition value is "+sum);
		System.out.println("The Addition value is "+sub);
		System.out.println("The Addition value is "+multiply);
		System.out.println("The Addition value is "+division);
	}

}
