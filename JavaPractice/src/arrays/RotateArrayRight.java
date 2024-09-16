package arrays;

import java.util.Arrays;

public class RotateArrayRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		int d=2;
		int length=a.length;
		//Output: 3 4 5 1 2
		int b[]=new int [length];
		int count=0;
		System.out.println(Arrays.toString(a));
		for(int i=length-d-1;i<length;i++)
		{
			b[count++]=a[i];
		}
		System.out.println(Arrays.toString(b));
		
		for(int j=0;j<d;j++)
		{
			b[count++]=a[j];
		}
		System.out.println(Arrays.toString(b));
	}

}
