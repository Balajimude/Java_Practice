package numbers;

public class palindromeNumber
{

	public static void main(String[] args) 
	{
		int a=16461;
		int temp=a;
		int rev=0;
		while(a!=0)
		{
			rev=rev*10+a%10;
			a=a/10;
		}
		if(temp==rev)
			System.out.println("Given no is palindrome");
		else
			System.out.println("Given no is not palindrome");

	}

}
