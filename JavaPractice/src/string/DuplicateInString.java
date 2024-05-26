package string;

public class DuplicateInString 
{

	public static void main(String[] args) 
	{
		String s="automation";
		char c[]=s.toCharArray();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(c[i]==c[j])
					count++;
			}
		}
		System.out.println("Total Duplicate char in string is "+count);
	}

}


