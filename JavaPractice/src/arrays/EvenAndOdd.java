package arrays;

public class EvenAndOdd 
{

	public static void main(String[] args) 
	{
			int a[]= {10,20,54,69,48,69};
			for(int i=0;i<=a.length-1;i++)
			{
				if(a[i]%2==0)
					System.out.println(a[i]+" "+"Is Even Number");
				else
					System.out.println(a[i]+" "+"Is Odd Number");
			}
	}

}
