package basicConcept;

public class AbstractTest extends AbstractClassDemo
{
	

	public static void main(String[] args) 
	{
		AbstractTest ab=new AbstractTest();
		ab.display();
		ab.sum();
		
		ab.plus();
	}

	void plus()
	{
		System.out.println("plus");

	}
	void display()
	{
		System.out.println("display");
	}

	@Override
	void sum()
	{
		System.out.println("sum");

	}



}
