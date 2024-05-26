package arrays;

public class CommonElementArray 
{

	public static void main(String[] args) 
	{
		int a[]={5,10,12,25,9,8};
		int b[]={6,8,9,14,24,36};
	
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=b.length-1;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(b[j]);
				}
			}
		}
		
	}
}

