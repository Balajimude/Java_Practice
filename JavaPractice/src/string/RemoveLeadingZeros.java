package string;

public class RemoveLeadingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Input: 000012356098
//		Output: 12356098
		
		String ip="000012356098";
		String op="";
		
		op=ip.replaceAll("0","");
		System.out.println(op);
		String res="";
		for(int i=0;i<ip.length();i++)
		{
			int no=Character.getNumericValue(ip.charAt(i));
			if(no!=0)
			{
				res=res+ip.charAt(i);
			}
		}
		System.out.println(res);
		
	}

}
	