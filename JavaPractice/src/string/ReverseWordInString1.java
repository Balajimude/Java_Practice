package string;

public class ReverseWordInString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "I love my country";
		//output="I olev ym ocnurty"
		String output="";
		String []s=str.split(" ");
		
		for(String str1:s)
		{
			char ch[]=str1.toCharArray();
			for(int i=ch.length-1;i>=0;i--)
			{
				output=output+ch[i];
			}
			output=output+" ";
		}
		System.out.println(output);
		
		
	}

}
