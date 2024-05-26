package string;

public class reverseString
{
	
	void usingCharAt( String str,String temp)
	{
		   System.out.println("origanal String is" +str);
			
			for(int i=str.length()-1;i>=0;i--)
			{
				temp=temp+str.charAt(i);
			}
		    System.out.println("After reversing string is" +" "+temp);	
	}
	void usingCharArray(String str,String temp)
	{
		char a[]=str.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			temp=temp+a[i];
		}
		System.out.println("After reversing string is" +" "+temp);	
	}

	public static void main(String[] args)
	{
		  String str="Balaji";
		  String temp="";
		  reverseString rs=new reverseString();
		  rs.usingCharAt(str,temp);
		  rs.usingCharArray(str, temp);
	   
	}

}
