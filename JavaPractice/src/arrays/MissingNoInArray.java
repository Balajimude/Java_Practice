package arrays;

public class MissingNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n[]= {1,3,5,6,7,4,2,8,10};
		int miss=1;
		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]>n[j])
				{
					int temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}	
		}
//		for(int m=0;m<n.length;m++)
//		{
//			System.out.println(n[m]);
//		}
		for(int a=0;a<n.length;a++)
		{
			
			if(n[a]!=miss)
			{
				System.out.println(miss);
			}
			miss=miss+1;

		}
	}

}
