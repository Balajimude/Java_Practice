package string;

public class RearrangeAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "AC2BEW3";
		//Output: "ABCEW5"
		
//		Explanation: 2 + 3 = 5 and we print all
//		alphabets in the lexicographical order.
		
		
		char ch[]=s.toCharArray();
		int sum=0;
		String op="";
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]>0 && ch[i]<10)
			{
				sum=sum+ch[i];
			}
			else
			{
				for(int j=i+1;j<s.length();j++)
				{
					if(ch[i]>ch[j])
					{
						char c=ch[j];
						ch[j]=ch[i];
						ch[i]=c;
										}
				}
				
			}
		}
		
		//String re="";
		System.out.println(op);
		
	}

}
