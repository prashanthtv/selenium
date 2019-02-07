package practice;

public class Split {

	public static void main(String[] args) {
	String name = "selenium QTP HP";
	String [] result= name.split(" ");
	for (int i=0;i<result.length;i++)
	{
		
		System.out.println(result[i]);
	}
	}

}
