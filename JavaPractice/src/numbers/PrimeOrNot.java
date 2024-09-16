package numbers;

public class PrimeOrNot {

	public static void main(String[] args) 
	{
        // int count=0;
		for(int i=2;i<20;i++)
		{	int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.println(i +""+"is prime Number");
			else
			    System.out.println(i+""+"is not prime Number");
		}
	}


}