package string;

public class ChangeTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abCD";
		//Output: abcd
		
		//Given a string S, the task is to change the complete string to Uppercase or Lowercase 
		//depending upon the case for the first character.
		
		//char ch[]=s.toCharArray();
		String output="";
		 char c=s.charAt(0);
			if(Character.isUpperCase(c))
			{
				output=s.toUpperCase();
			
			}
			else if(Character.isLowerCase(c))
			{
				output=s.toLowerCase();
				
			}
			System.out.println(output);
		
	}

}
	