package arrays;

import java.util.HashMap;

public class CountNoOfEachElementInArray 
{
   public static void main(String args[])
   {
	   int[] no = {1, 2, 3, 2, 3, 1, 4, 1, 2, 3, 5};
	   
	   HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
	   for(int i:no)
	   {
		   if(hm.containsKey(i))
		   {
			   int count=hm.get(i);
			   hm.put(i, ++count);
		   }
		   else
		   {
			   hm.put(i, 1);
		   }
	   }
	     System.out.println(hm);
   }
}

