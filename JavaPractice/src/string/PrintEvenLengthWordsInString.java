 package string;

public class PrintEvenLengthWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Input: s = "This is a java language and"
//		Output: This is  java language
		
		String s="This is a java language";
		String op="";
		String split[]=s.split(" ");
		
		for(String str:split)
		{
			int length=str.length();
			if(length%2==0)
			{
				op=op+str;
				op=op+" ";
			}
		}
		System.out.println(op);
	}

}
