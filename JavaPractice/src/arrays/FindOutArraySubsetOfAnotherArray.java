package arrays;

import java.util.ArrayList;

public class FindOutArraySubsetOfAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a2[] = {11, 3, 7, 1, 7};
		int a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
		boolean isSubset=true;
		ArrayList<Integer>lst=new  ArrayList<Integer>();
		for(int n:a1)
		{
			lst.add(n);
		}
		for(int a:a2)
		{
			if(!lst.contains(a))
			{
				isSubset=false;
			}
		}
		if(isSubset)
		  System.out.println("Given Array is subset of another Array");
		else
		  System.out.println("Given Array is not subset of another Array");

	}

}
