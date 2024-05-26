package numbers;

public class reverseNumber
{

	void usingModoperators()
	{

		int a=12345;
		 System.out.println("origanal numbers are" +a);
		int rev=0;
		while(a!=0)
		{
			rev=rev*10+a%10;
			 a=a/10;
		}
		 System.out.println("after reverse numbers are" + rev);
			
	}
	public static void main(String[] args) 
	{
		 
	}

}
