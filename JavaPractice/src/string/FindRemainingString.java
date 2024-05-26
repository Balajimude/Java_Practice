package string;

public class FindRemainingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String  s = "Thisisdemostring";
		char ch = 'i';
		int count = 3;
		//Output: ng
		char[] c=s.toCharArray();
		int flag=0;
		String output="";
		for(int i=0;i<s.length();i++)
		{
			if(c[i]==ch)
			{
				flag++;
			}
			if(flag==count && c[i]!=ch)
			{
				output=output+c[i];
			}
		}
		System.out.println(output);
	}
	
	

}
