package string;

public class RemoveGivenChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Hello Balaji";
	    String temp="";
	    
	    for(int i=0;i<s.length();i++)
	    {
	    	if(s.charAt(i)!='l')
	    	{
	    		temp=temp+s.charAt(i);
	    	}
	    }
	    System.out.println(temp);
	}

}
