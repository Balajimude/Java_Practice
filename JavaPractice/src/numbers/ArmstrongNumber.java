package numbers;

public class ArmstrongNumber 
{

	public static void main(String[] args) 
	{
			int a=153;
			int a1=a;
			int n=0;
			int sum=0;
			for(int i=1;i<=3;i++)
			{
				n=a%10;
				a=a/10;
				sum=sum+n*n*n;
			}
			if(a1==sum)
			System.out.println("Given no is armstrong");
			else
				System.out.println("Given no is not armstrong");
	}

}

