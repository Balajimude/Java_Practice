package string;

public class CountWordsInString
{

	public static void main(String[] args)
	{
		String s="welcome to java";
		String splt[]=s.split(" ");
		int count=0;
		for(int i=0;i<=splt.length-1;i++)
		{
			if(splt[i].equals("java"))
			count++;
		}
		System.out.println("NO of words in string is"+" "+count);
	}

}


