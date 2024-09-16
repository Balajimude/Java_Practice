package string;

public class palindromeString 
{

	public static void main(String[] args) 
	{
        String str="MADAM";
        String temp="";
        char a[]=str.toCharArray();
        for(int i=a.length-1;i>=0;i--)
        {
        	temp=temp+a[i];
        }
        if(temp.equals(str))
        	System.out.println("Given string is palindrome");
        else
        	System.out.println("Given string is not palindrome");
	}
}
