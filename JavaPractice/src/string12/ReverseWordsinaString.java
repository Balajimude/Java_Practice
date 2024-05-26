package string12;

public class ReverseWordsinaString {

	public static void main(String[] args) {
		
		String str="Balaji Shahaji Pooja Mude";
		String[] s=str.split(" ");
		char[] c;
		for(int i=0;i<s.length;i++)
		{
			 c=s[i].toCharArray();
			for(int j=c.length-1;j>=0;j--)
			{
				System.out.print(c[j]);
			}
			System.out.print(" ");	
		}
	}
}
