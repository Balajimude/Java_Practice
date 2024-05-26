package numbers;

public class countNoOfDigit
{

	public static void main(String[] args)
	{
		int a=12345;
		int flag=0;
		//int rev=0;
		while(a!=0)
		{
			//rev=rev*10+a%10;
			a=a/10;
			flag=flag+1;
		}
		System.out.println("Number of count is"+flag);
		
		 
	}

}
