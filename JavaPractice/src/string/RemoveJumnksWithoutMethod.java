	package string;
	
	public class RemoveJumnksWithoutMethod
	{
		
		    public static void main(String args[])
		    {
		       String str = "Hellow&%$#@World" ;
		       String temp="";
		       for(int i=0;i<str.length();i++)
		       {
		         char c=str.charAt(i);
		         if(c!='&' && c!='%'&& c!='$'&& c!='#'&& c!='@')
		         {
		           temp=temp+c;
		         }
		       }  
		       System.out.println(temp);
		    }
		    
		
	}
