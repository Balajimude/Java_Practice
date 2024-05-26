package arrays;

public class DuplicateElements 
{

	public static void main(String[] args)
	{
		int a[]= {10,56,56,65,12,14,32,32,14};
		//int d=a[0];
		int flag=0;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					flag++;
					System.out.println(a[j]);
				}		
			}
		}
		if(flag!=0)
			System.out.println("Array has Duplicate Number");
		else
			System.out.println("Array not hass Duplicate Number");

	}
}


