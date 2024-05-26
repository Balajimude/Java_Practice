package string;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesInString {
    public static void main(String[] args) {
        String str = "balaji";
        String st = ""; // Initialize an empty string to store unique characters

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            
            // Check if the current character is not already present in the result string
            if (st.indexOf(currentChar) == -1) {
                st = st + currentChar; // Append the current character to the result string
            }
        }
        
        System.out.println(st); // Output the string without duplicates
        
        List<Character> lst=new ArrayList<Character>();
        char [] s=str.toCharArray();
        for(char c:s)
        {
        	if(!lst.contains(c))
        	{
        		lst.add(c);
        	}
        }
        //String result=Character.toString(lst);
        System.out.println(lst);
    }
}





