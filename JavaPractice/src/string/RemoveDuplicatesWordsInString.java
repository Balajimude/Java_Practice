package string;

import java.util.HashSet;

public class RemoveDuplicatesWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Welcome to java Welcome to selenium selenium balaji";
		HashSet<String>hs=new HashSet<String>();
		String [] split=s.split(" ");
		
		for(String str:split)
		{
			hs.add(str);
		}
		// String result = String.join(" ", hs);
		System.out.println(hs);
		
		
	}
}



