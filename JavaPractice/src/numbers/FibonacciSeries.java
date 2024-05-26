package numbers;

public class FibonacciSeries 
{

	public static void main(String[] args)
	{
			//0 1 1 2 3 5 8 13
			int a=0,b=1,sum=0;
			System.out.println(a+""+b);
			for(int i=2;i<=10;i++)
			{ 
				sum=a+b;
				System.out.println(sum);
				a=b;
				b=sum;
			}

	}

}

