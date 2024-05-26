package string;

public class CountVowelsCharactersInString
{

	public static void main(String[] args) 
	{
		String s="balajimude";
		char[]ch=s.toCharArray();
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(ch[i]=='a' ||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				count++;
			}
		}
		System.out.println("No of Vowels in string is"+" "+count);
	}

}

