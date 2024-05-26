package string;

public class ReverseWordInString 
{

	public static void main(String[] args)
	{
		String s="welcome to java";
		String splt[]=s.split(" ");
		char c[];
		String str;
		for(int i=0;i<=splt.length-1;i++)
		{  
			str=splt[i];
			c=str.toCharArray();
			for(int j=c.length-1;j>=0;j--)
			{
				System.out.print(""+c[j]);
			}
			System.out.print(" ");
		}
	}

}

