package numbers;

public class OddEvenNoInDigit
{

	public static void main(String[] args) 
	{
		int no=32658;
		int even_count=0;
		int odd_count=0;
		while(no!=0)
		{
		  int a=no%10;
		  no=no/10;
			if(a%2==0)
				even_count++;
			else
				odd_count++;
			
		}
		System.out.println("no of even digit is"+even_count);
		System.out.println("no of even digit is"+odd_count);
	}

}
