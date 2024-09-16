package string;

public class InsertAStringIntoAnotherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Input: originalString = "GeeksGeeks", 
//	    stringToBeInserted = "For", 
//	    index = 4
//      Output: "GeeksForGeeks"
		
		String s1="GeeksGeeks";
		String s2 = "For";
		int index=4;
		String op="";
		for(int i=0;i<s1.length();i++)
		{
			op=op+s1.charAt(i);
			if(i==index)
			{
				op=op+s2;
			}
		}
		System.out.println(op);
		
		System.out.println("-----------------");
	
		String res=s1.substring(0, index+1)+s2+s1.substring(index+1);
		System.out.println(res);
		
		
	}

}
