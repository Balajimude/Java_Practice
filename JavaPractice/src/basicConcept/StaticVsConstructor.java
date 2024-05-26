package basicConcept;

public class StaticVsConstructor 
{

	
	 static 
	{
		System.out.println("I am static");
		int a=10;
		int b=20;
	}
	public  StaticVsConstructor()
	{
		System.out.println("I am constructor");
		//System.out.println(a+b);
	}
  private StaticVsConstructor(int x)
	{
		System.out.println(x);
	}
	public static void main(String[] args) 
	{
      // StaticVsConstructor s=new StaticVsConstructor();
       //StaticVsConstructor s1=new StaticVsConstructor(10);//access only within class
	}
	
}
