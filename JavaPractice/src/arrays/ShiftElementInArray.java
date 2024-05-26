package arrays;

import java.util.Arrays;

public class ShiftElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
		//Output : 1  3  2  11  6  -1  -7  -5
		int []op=new int[arr.length];
		int count=0;
		
		for(int n:arr)
		{
			if(n<0)
			{
				op[count++]=n;
			}
		}
		for(int no:arr)
		{
			if(no>=0)
			{
				op[count++]=no;
			}
		}
		System.out.println(Arrays.toString(op));
	}

}
