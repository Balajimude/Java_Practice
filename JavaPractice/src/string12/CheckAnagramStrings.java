package string12;

import java.util.Arrays;

public class CheckAnagramStrings {

	public static void main(String[] args) {
		
		String s1="silent";
		String s2="balaji";
		
		char ch[]=s1.toCharArray();
		char ch1[] =s2.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if(Arrays.equals(ch,ch1))
			System.out.println("Given String is Anagram");
		else
			System.out.println("Given String is not Anagram");
	}
}
