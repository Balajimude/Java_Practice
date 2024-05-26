package interviewQuestion;

public class StaticDemo 
{
	
		   static int a = 20;
		   static int b = 30;
		   static int c = 40;
		   StaticDemo() 
		   {
		      a = 200;
		   }
		static void m1() 
		{
		      b = 300;
		}
		static {
		      c = 400;
		     // b = 300;
		}
		public static void main(String[] args) 
		{
		     System.out.println(a);
		     StaticDemo.m1();
		     System.out.println(b);
		     System.out.println(c);
		}
	
}

