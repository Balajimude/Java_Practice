package interviewQuestion;

public class Print_1_to_100_Without_Loop 
{

	public static void main(String[] args) 
	{
		printNo(1);
	}
	public static void printNo(int num)
	{
		if(num<=100)
		{
			System.out.println(num);
			num++;
			printNo(num);
		}
	}

}
