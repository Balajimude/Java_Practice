package string;

public class CompareString
{

	public static void main(String[] args)
	{
		//using equals method
		String s="Balaji";
		String s1="Balaji";
		String s2=new String("Balaji");
		//using equals method
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		// using == operator
		System.out.println(s==s2);
	}
}
