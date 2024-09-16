package string;

public class SwappingPairOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Input: str = “GeeksForGeeksme”
//		Output: eGkeFsroeGkes
		
		String s="GeeksForGeeksme";
	    char []ch=s.toCharArray();
		for(int i=0;i<s.length()-1;i+=2)
		{
			char temp=ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=temp;
		}
		System.out.println(new String(ch));
	}

}
