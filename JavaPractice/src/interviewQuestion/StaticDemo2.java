package interviewQuestion;

public class StaticDemo2
{
		  static int a = 20;
		  static
		  {
		        a++;
		   }
		{
		    a++;
		    System.out.println(a);
		}
		public static void main(String[] args) 
		{
		   StaticDemo2 obj = new StaticDemo2();
		   StaticDemo2 obj2 = new StaticDemo2();
		   StaticDemo2 obj3 = new StaticDemo2();
		  }

}
