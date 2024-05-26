package string;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveConsonantsFromAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abEkipo";
		//Output = aEio
		String output="";
		ArrayList<Character> vovelLst=new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
		ArrayList<Character> lst= new ArrayList<Character>();
		char []ch=s.toCharArray();
		//First Method
		for(char c:ch)
		{
			if(vovelLst.contains(c))
			{
				lst.add(c);
			}
		}
		System.out.println(lst);
		//Second Method
		for(char d:ch)
		{
			if (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u' ||
				    d == 'A' || d == 'E' || d == 'I' || d == 'O' || d == 'U')
			{
				output=output+d;
			}
		}
		System.out.println(output);
		
	}

}
