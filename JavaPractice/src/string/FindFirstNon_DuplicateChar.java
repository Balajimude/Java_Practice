package string;

import java.util.HashMap;


public class FindFirstNon_DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="swiss";
		
		char c[]=s.toCharArray();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(Character c1:c)
		{
			if(hm.containsKey(c1))
			{
				int count=hm.get(c1);
				hm.put(c1, ++count);
			}
			else
			{
				hm.put(c1, 1);
			}
		}
		
		for (Character name: hm.keySet())         //iteration over keys  
		{  
		  int n=hm.get(name);   
		  if(n<2)
		  {
			  System.out.println("Key: " + name + ", Value: " + n);
			  break;
		  }
		     
		}   	
	}
}

