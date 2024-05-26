package numbers;

public class PrimeDemo {

	public static void main(String[] args) {
		
		//int  a=5;
		for(int i=2;i<15;i++)
		{
			int count=0;

			for(int j=1;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("Prime"+i);
			}
			else
				System.out.println("not prime"+i);
		}
	}

}

