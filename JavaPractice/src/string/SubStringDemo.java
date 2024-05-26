package string;

public class SubStringDemo 
{

	public static void main(String[] args)
	{
		String str="Balajimude4455@segg1";
		String sub=str.substring(3);
		String sub1=str.substring(3, 10);
		System.out.println(sub);
		System.out.println(str.length());
		System.out.println(sub1);
		System.out.println(str.compareTo(sub1));
		System.out.println(str.equals(sub1));
	}

}
