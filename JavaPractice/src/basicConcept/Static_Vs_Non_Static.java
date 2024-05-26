package basicConcept;

public class Static_Vs_Non_Static
{
	int a=10;
	static int b=20,e=58;
	int c=30;
	
	void add()
	{
	
		System.out.println(a+c);
		System.out.println(a+b);
		
	}
	static void difference()
	{
		System.out.println(e-b);
		b=39;
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		Static_Vs_Non_Static s=new Static_Vs_Non_Static();
		s.add();
		difference();

	}
}


