package string;

import java.util.ArrayList;

public class RemoveCommonCharactersAndConcatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   String s1 ="aacdb";
	   String s2 = "gafd";
		//Output: cbgf
	   
	   char s3[]=s1.toCharArray();
	   char s4[]=s2.toCharArray();
	   
	   ArrayList<Character> lstS1=new ArrayList<Character>();
	   ArrayList<Character> lstS2=new ArrayList<Character>();
	   
	   for(char d:s3)
	   {
		   lstS1.add(d);
	   }
	   for(char d1:s4)
	   {
		   lstS2.add(d1);
	   }
	  
	}

}
