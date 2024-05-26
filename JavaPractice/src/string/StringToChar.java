package string;

public class StringToChar 
{

	public static void main(String[] args) 
	{
		String s="Balaji";
		char[]c=s.toCharArray();
		char[] ch =new char[6];
		for(int i=0;i<=s.length()-1;i++)
		{
			ch[i]=s.charAt(i);
		}
		System.out.println(c);
		System.out.println(ch);
		
	}

}
