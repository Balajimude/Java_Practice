package numbers;

public class swapTwoNumbers
{ 
	 int a=10;int b=20;
    void usingPlusMinus()
    {
    	System.out.println("Original numbers are" + a+" "+b);
    	a=a+b;
    	b=a-b;
    	a=a-b;
        System.out.println("after swap numbers are" + a+" "+b);
    }
    void usingDivisionMultification()
    {
    	System.out.println("Original numbers are" + a+" "+b);
    	a=a*b;
    	b=a/b;
    	a=a/b;
        System.out.println("after swap numbers are" + a+" "+b);
    }
    
    
	public static void main(String[] args)
	{
	 swapTwoNumbers stn=new swapTwoNumbers();
	// stn.usingPlusMinus();
	 stn.usingDivisionMultification();
	 
       
	}

}
