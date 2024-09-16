package string;

public class SwapTwoStringWithoutTemp 
{

	public static void main(String[] args) 
	{
		String s= "Balaji";
		String s2="Mude";
		s=s.concat(s2);
		s2=s.substring(0, 6);
		s=s.substring(6);
		System.out.println("s ="+s);
		System.out.println("s2 ="+s2);
		s=s+'@'+s2;
		String []c=s.split("@");
		s2=c[0];
		s=c[1];
		System.out.println(s);
		System.out.println(s2);	
	}
}
