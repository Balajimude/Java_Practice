package string;

public class SumofNumbersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "1abc23";
		char c[]=str.toCharArray();
		int sum=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='0' && c[i]<='9')
			{
				sum += Character.getNumericValue(c[i]);
			}
		}
		System.out.println("Sum is"+" "+sum);
	}
	

}
