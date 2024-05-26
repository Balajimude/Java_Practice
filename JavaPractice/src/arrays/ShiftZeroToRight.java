package arrays;

import java.util.Arrays;

public class ShiftZeroToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,0,6,8,0,2,0,1,4};
		int b[]=new int[a.length];
		int count=0;
		for(int no:a)
		{
			if(no!=0)
			{
				b[count]=no;
				count++;
			}
		}
		System.out.println(Arrays.toString(b));
	}

}
