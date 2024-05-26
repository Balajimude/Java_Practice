package numbers;

public class SumOfDigit 
{

	public static void main(String[] args)
	{
		int no=123456;
		int temp=0;
		while(no!=0)
		{
			temp=temp+no%10;
			no=no/10;
		}
		System.out.println(temp);

	}

}
