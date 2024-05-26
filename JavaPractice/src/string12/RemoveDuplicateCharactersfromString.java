package string12;

public class RemoveDuplicateCharactersfromString {

	public static void main(String[] args) {
		
		String str="javava";
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			if(temp.indexOf(str.charAt(i))==-1)
            {
            	temp=temp+str.charAt(i);
            }
		}
		System.out.println(temp);
	}
}
