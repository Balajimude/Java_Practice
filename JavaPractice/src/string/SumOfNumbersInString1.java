package string;

public class SumOfNumbersInString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "India requires 30 runs from 17 balls to win the world cup";
		int sum = 0;
		String s[] = str.split(" ");
		for (String str1 : s) 
		{
			char ch[]=str1.toCharArray();
			for(char c:ch)
			{
				if (Character.isDigit(c)) 
				{
					//System.out.println(c);
					int n = Character.getNumericValue(c);
					sum = sum + n;
				}
			}
		}
		System.out.println(sum);
	}

}
