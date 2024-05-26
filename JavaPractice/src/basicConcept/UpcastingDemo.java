package basicConcept;

public class UpcastingDemo extends UpcastingDemo1
{

	void display()
	{
		//super.display();
		System.out.println("This is sub class");
	}
	void add()
	{
		System.out.println("This is sub class");
	}
	void add1()
	{
		System.out.println("This is sub class");
	}
	public static void main(String[] args) 
	{
		UpcastingDemo1 up=new UpcastingDemo();
		up.display();
		up.add();
		up.add2();
	}
}
