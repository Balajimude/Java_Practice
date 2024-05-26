package string;

import java.util.HashMap;

public class PrintLengthOfEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String s = "Hardships often prepare ordinary people for an extraordinary destiny";
        
        String []split=s.split(" ");
        
        HashMap<String,Integer>hm=new HashMap<String, Integer>();
        for(String name:split)
        {
        	hm.put(name,name.length());
        }
        
        for(String str:hm.keySet())
        {
        	System.out.println( str + ", Length: " + hm.get(str));
        }
	}

}
