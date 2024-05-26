package arrays;

public class SecondHigstNo
{

	public static void main(String[] args)
	{
		int a[]= {2,3,45,66,32,50,100,154};
		int temp=0;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Second Higest No is "+a[1]);
	}

}

