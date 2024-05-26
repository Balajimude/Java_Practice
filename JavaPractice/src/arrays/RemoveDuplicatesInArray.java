package arrays;

class RemoveDuplicatesInArray
{   public static void main(String args[])
    {
	   int a[] = {10, 20, 40, 30, 30, 20, 10, 60, 50};
       int b[] = new int[a.length];
	   int count=0;
	   for(int i=0;i<a.length;i++)
	   {
	      for(int j=1;j<a.length;j++)
		  {
		    if(a[i]!=a[j])
			{
			  b[count]=a[i];
			  count++;
			}
		  }
		  
	   }
	   for(int k:b)
	   {
	     System.out.println(k);
	   }
	} 
}