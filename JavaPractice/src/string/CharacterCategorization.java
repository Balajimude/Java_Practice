package string;

public class CharacterCategorization {

	public static void main(String[] args) {
		
		 String input = "aB$7cD@1^eF%2*G3H";
		 
		 char ch[]=input.toCharArray();
		 for(char c:ch)
		 {
			 if(c=='!'||c=='@'||c=='#'||c=='$'||c=='^'||c=='&'||c=='*')
			 {
				 System.out.println("Special Characters"+" "+c);
			 }
			 else if(Character.isDigit(c))
				 System.out.println("Numbers"+" "+c);
			 else
				 System.out.println("Other Characters"+" "+c);
		 }
	}
}
