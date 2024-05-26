package string;

import java.util.ArrayList;

public class RemoveCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "computer";
		String s2 = "cat";
		//Output: "ompuer"
		
		ArrayList<Character> lst1=new ArrayList<Character>();
		ArrayList<Character> lst2=new ArrayList<Character>();
		char []c1=s1.toCharArray();
		char []c2=s2.toCharArray();
		for(char m:c2)
		{
			lst2.add(m);
		}
		
		for(char d:c1)
		{
			if(!lst2.contains(d))
			{
				lst1.add(d);
			}
			
		}
		System.out.println(lst1);
	}

}
