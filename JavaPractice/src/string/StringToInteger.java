package string;

public class StringToInteger
{

	public static void main(String[] args) 
	{
		String s="400";
		// parseInt is a static method of Integer class 
		int no=Integer.parseInt(s);
		//valueOf is static method of Integer class
		int n=Integer.valueOf(s);
		System.out.println(s);
		System.out.println(n);
	}

}
