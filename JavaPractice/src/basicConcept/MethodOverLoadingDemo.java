package basicConcept;

public class MethodOverLoadingDemo
{
	static void add(int a,float b)
	{
		System.out.println(a+b);
	}
	
	static void add(int c,int d)
	{
		//System.out.println(a+b);
	}
	public static void main(String[] args)
	{
		add(10,25);
		
	}

}
