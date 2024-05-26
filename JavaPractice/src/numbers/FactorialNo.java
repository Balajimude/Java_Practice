package numbers;

public class FactorialNo 
{

	public static void main(String[] args) 
	{
		int a=7;
		int fact=1;
		for(int i=7;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of 7 is"+" "+fact);
	}

}

