package string;

public class CountOccuranceOfCharacter 
{

	public static void main(String[] args) 
	{
		String s="Balaji Mude Java Lava";
		char[]c=s.toCharArray();
		int count=0;
		System.out.println(c.length);
		for(int i=0;i<=c.length-1;i++)
		{
			if(c[i]=='a')
				count++;
		}
		System.out.println("No of Occurance of a is"+" "+count);
	}

}

 
