package string;

public class IntegerToString 
{

	public static void main(String[] args) 
	{
		int a=200;
		String s=Integer.toString(a);
		System.out.println(s);
		System.out.println(s+300);//string concatation
		System.out.println(a+300);
	}
}
