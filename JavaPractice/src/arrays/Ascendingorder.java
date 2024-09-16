package arrays;

public class Ascendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]	= {2,100,7,2,7,5,9,0,34,43,34,10};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int n:a)
		{
			System.out.println(n);
		}
		
	}
}
