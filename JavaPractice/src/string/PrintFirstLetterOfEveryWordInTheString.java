package string;

public class PrintFirstLetterOfEveryWordInTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "geeks for geeks";
		//Output: gfg
		System.out.println(s);
		String output="";
		String [] split=s.split(" ");
		
		for(String str:split)
		{
			char c[]=str.toCharArray();
			for(char d:c)
			{
				output=output+d;
				break;
			}
		}
		System.out.println(output);
	}

}
