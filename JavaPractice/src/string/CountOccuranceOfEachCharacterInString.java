package string;

import java.util.HashMap;

public class CountOccuranceOfEachCharacterInString {

	public static void main(String[] args) {
		
		String s="Welcome to java welcome to selenium";
		s.toLowerCase();
		s=s.replaceAll(" ", "");
		//System.out.println(s);
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(hm.containsKey(s.charAt(i)))
			{
				int count=hm.get(s.charAt(i));
				hm.put(s.charAt(i), ++count);
			}
			else
			{
				hm.put(s.charAt(i), 1);
			}
		}
		System.out.println(hm);
		
		
	}
}


