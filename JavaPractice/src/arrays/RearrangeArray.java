package arrays;

import java.util.Arrays;

public class RearrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// input:  arr[] = {1, 2, 3, -4, -1, 4}
		//Output: arr[] = {-4, 1, -1, 2, 3, 4}
		   
		 int arr[]= {1, 2, 3, -4, -1, 4};
		 int out[]=new int [arr.length];
		 int even=0;
		 int odd=1;
		 for(int n:arr)
		 {
			 if(n<0)
			 {
				 out[even]=n;
				 even=even+2;
			 }
			 if(n>0 )
			 {
				 out[odd]=n;
				 odd=odd+1;
			 }
			 
		 }
		 System.out.println(Arrays.toString(out));
	}

}
