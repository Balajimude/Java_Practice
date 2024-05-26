package interviewQuestion;

public class StaticDemo1 
{
	
		  static int a = 20;
		  StaticDemo1() 
		  {
		       a++;
		  }
		 void m1() 
		 {
		       a++;
		       System.out.println(a);
		  }
		public static void main(String[] args) 
		{
		    StaticDemo1 s1 = new StaticDemo1();
		    StaticDemo1 s2 = new StaticDemo1();
		    StaticDemo1 s3 = new StaticDemo1();
		       s3.m1();
		  }

}
