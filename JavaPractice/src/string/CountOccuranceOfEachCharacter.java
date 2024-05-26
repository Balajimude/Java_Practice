package string;

import java.util.HashMap;

public class CountOccuranceOfEachCharacter {

	
	  public static void main(String[] args)
	  {
	    String str="balajibalaji";
	    
	    HashMap<Character,Integer> hm=new HashMap<>();
	    
	    for(char c:str.toCharArray())
	    {
	       if(hm.containsKey(c))
	       {
	          int count=hm.get(c);
	          hm.put(c,++count);
	       }
	       else
	       {
	          hm.put(c,1);
	       }
	    }
	    System.out.print(hm);
	  }
	}



