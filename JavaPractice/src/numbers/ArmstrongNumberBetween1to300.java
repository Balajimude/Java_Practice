package numbers;

public class ArmstrongNumberBetween1to300 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=1;i<=1000;i++)
		{
			int no=i;
			int b=i;
			int sum=0;
			while(b!=0)
			{
				int a=b%10;
				b=b/10;
				sum=sum+a*a*a;
			}
			if(no==sum)
				System.out.println("armstrong no"+" "+no);
//			else
//				System.out.println("not armstrong no"+" "+no);
		}
	}

}

