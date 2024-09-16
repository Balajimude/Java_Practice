package numbers;

public class ReplaceAll0sWith5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Input: n = 1004
	   // Output: 1554
		
		int n=1004;
		String s=Integer.toString(n);
		System.out.println(s);
		String s1=s.replace('0','5');
		System.out.println(s1);
		String op="";
		char ch[]=s.toCharArray();
		for(char c:ch)
		{
			if(c=='0')
			{
				op=op+5;
			}
			else
			{
				op=op+c;
			}
		}
		System.out.println(op);
	}	
}
