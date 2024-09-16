package string;

public class ReplaceCharacterataSpecificIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Input: str = "Geeks for geeks" , index = 10 , ch = 'G'
//		Output: "Geeks for Geeks"
//	
		String s="Geeks for geeks";
		int index=10;
		char ch='G';
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			temp=temp+s.charAt(i);
			if(i==index)
			{
				temp=temp+'G';
			}
		}
		System.out.println(temp);
		 String str=s.substring(0, index)+ch+s.substring(index+1);
		 System.out.println(str);
		
	}
}
