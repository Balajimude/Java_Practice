package arrays;

import java.util.Arrays;

public class ShiftElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Input[]={-12, 11, -13, -5, 6, -7, 5, -3, -6}; 
		//Output: -12 -13 -5 -7 -3 -6 11 6 5
		int count=0;
		int op[]=new int[Input.length];
		for(int i=0;i<Input.length;i++)
		{
			if(Input[i]<0)
			{
				op[count++]=Input[i];
			}	
		}
		for(int n:Input)
		{
			if(n>0)
				op[count++]=n;
		}
		
		System.out.println(Arrays.toString(op));
	}

}
