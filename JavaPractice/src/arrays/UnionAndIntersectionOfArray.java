package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UnionAndIntersectionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {1, 3, 4, 5, 7,3,4,5};
        int arr2[] = {2, 3, 5, 6,3,5,6}; 
         //Output: Union : {1, 2, 3, 4, 5, 6, 7} 
         //Intersection : {3, 5}
        
        //Union
        
        HashSet<Integer> union=new HashSet<Integer>();
        for(int no:arr1)
        {
        	union.add(no);
        }
        for(int n:arr2)
        {
        	union.add(n);
        }
        System.out.println("Union--"+" "+union);
        
        //Intersection
        
        HashSet<Integer> inter=new HashSet<Integer>();
        
        for(int a:arr1)
        {
        	inter.add(a);
        }
        HashSet<Integer> tempSet=new HashSet<Integer>();
        //List<Integer> lst=new ArrayList<Integer>();
        for(int k:arr2)
        {
        	if(inter.contains(k))
        	{
        		tempSet.add(k);
        	}
        }
        System.out.println("Intersection--"+" "+tempSet);   
	}

}
