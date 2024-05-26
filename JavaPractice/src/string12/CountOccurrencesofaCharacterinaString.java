package string12;

public class CountOccurrencesofaCharacterinaString 
{
   public static void main(String[] args) {

		String str="balajicneknsdlkcnAXN";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a')
				count++;
		}
		System.out.println(count);
}
}
