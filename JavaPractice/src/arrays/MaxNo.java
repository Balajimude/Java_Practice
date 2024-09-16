package arrays;

public class MaxNo 
{

	public static void main(String[] args) 
	{
		
		int a[]= {5,10,6,8,94,95};
		int max=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.println(max);
	}

}

