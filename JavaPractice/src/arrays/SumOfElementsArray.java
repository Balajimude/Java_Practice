package arrays;

public class SumOfElementsArray 
{

	public static void main(String[] args)
	{
		int a[]= {10,23,65,12,98,45};
		int sum=0;
		//System.out.println(a[5]);
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("Sum of Array is"+" "+sum);
	}
}
