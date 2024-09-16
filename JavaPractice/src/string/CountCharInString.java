package string;

public class CountCharInString {

	public static void main(String[] args) 
	{

		String s="Balaji Mude Java Lava";
		char[]c=s.toCharArray();
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(c[i]!=' ')
				count++;	
		}
		System.out.println("No of Words In String is"+" "+count);
	
	}
}

