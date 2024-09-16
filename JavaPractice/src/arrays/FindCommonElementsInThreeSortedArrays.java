package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindCommonElementsInThreeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Input: A[] = {1, 5, 10, 20, 30} , B[] = {5, 13, 15, 20}, C[] = {5, 20} 
		//Output: 5 20
		
		int a[]={1, 5, 10, 20, 30} , b[] = {5, 13, 15, 20}, c[] = {5, 20};
		
		Set<Integer> set=new HashSet<Integer>();
		Set<Integer> set1=new HashSet<Integer>();
		for(int n:a)
		{
			set.add(n);  //1 5 10 20 30  //
		}
		for(int m:b)
		{
			if(set.contains(m))
			{
				set1.add(m);
			}
		}
		//set.clear();
		for(int k:c)
		{
			if(set1.contains(k))
			{
				set1.add(k);
			}
		}
		System.out.println(set1);
		
	}

}

