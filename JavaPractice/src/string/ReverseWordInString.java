package string;

public class ReverseWordInString 
{

	public static void main(String[] args)
	{
		String s="welcome to java";
		        // avaj ot emoclew
		String splt[]=s.split(" ");
//		char c[];
//		String str;
//		for(int i=0;i<=splt.length-1;i++)
//		{  
//			str=splt[i];
//			c=str.toCharArray();
//			for(int j=c.length-1;j>=0;j--)
//			{
//				System.out.print(""+c[j]);
//			}
//			System.out.print(" ");
//		}
		
		String temp="";
		char ch[];
		for(int k=splt.length-1;k>=0;k--)
		{
			temp=splt[k];
			ch=temp.toCharArray();
			for(int m=ch.length-1;m>=0;m--)
			{
				System.out.print(""+ch[m]);
			}
			System.out.print(" ");
		}
		
		
	}

}

