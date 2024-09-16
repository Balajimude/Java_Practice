package arrays;

public class ArrayCompare 
{

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6};
		int b[]= {1,2,3,4,5,7};
		int count=0;
		if(a.length==b.length)
		{
			for(int i=0;i<=a.length-1;i++)
			{
				if(a[i]!=b[i])
				{
					count++;
				}
			}
			if(count==0)
				System.out.println("Given Array Is Same");
			else
				System.out.println("Given Array Is Not Same");		
		}
		else
			System.out.println("Given Array is Not Able To Compare");
	}
}
