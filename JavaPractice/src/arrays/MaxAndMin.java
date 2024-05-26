package arrays;

public class MaxAndMin
{

	public static void main(String[] args) 
	{
		int a[]= {10,32,5,102,36,9,100};
		//List<integer> list = Arrays.asList(array);
		int max=a[0];
		int min=a[0];
		for(int i=1;i<=a.length-1;i++)
		{
			if(max>a[i])
			{
				max=a[i];
				
				//return;
			}
			else if(min<a[i])
			{
				min=a[i];
			}
		}
		
		System.out.println("max no is"+" "+min);
		System.out.println("min no is"+" "+max);
	}
}

