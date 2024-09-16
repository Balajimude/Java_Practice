package arrays;

public class LinearSearch
{

	public static void main(String[] args) 
	{
		int a[]= {10,20,45,65,78,46,32};
		int no=50;
		int flag=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(no==a[i])
				flag++;	
		}
		if(flag!=0)
			System.out.println("Number is Present");
		else
			System.out.println("Number is Not Present");
	}
}

