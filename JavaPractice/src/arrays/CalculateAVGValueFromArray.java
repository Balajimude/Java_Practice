package arrays;

public class CalculateAVGValueFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,34,67,34,65,30,60};
		int sum=0;
		float avg=0;
		for(int n:a)
		{
			sum=sum+n;
		}
		avg=sum/a.length;
		System.out.println(avg);
	}
}


