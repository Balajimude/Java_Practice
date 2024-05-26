package string12;

import java.util.HashMap;

public class CountEachOccurrencesofaCharacterinaString {

	public static void main(String[] args) {
		
		String s="ilovebangalore";
		HashMap <Character,Integer> hm=new HashMap<Character,Integer>();
		
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
