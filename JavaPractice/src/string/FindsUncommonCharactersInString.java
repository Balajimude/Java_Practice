package string;

import java.util.ArrayList;

public class FindsUncommonCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String a = "geeksforgeeks";
		  String b= "geeksquiz";
		//Output: fioqruz
		  String result="";
		  char []a1=a.toCharArray();
		  char []b1=b.toCharArray();
		  ArrayList<Character> lstA=new ArrayList<Character>();
		  ArrayList<Character> lstB=new ArrayList<Character>();
		  for(char c:a1)
		  {
			  lstA.add(c);
		  }
		  for(char d:b1)
		  {
			  if(!lstA.contains(d))
			  {
				  result=result+d;
			  }
		  }
		  for(char n:b1)
		  {
			  lstB.add(n);
		  }
		  for(char m:a1)
          {
        	  if(!lstB.contains(m))
        	  {
        		  result=result+m;
        	  }
          }
		  System.out.println(result);
	}

}
