package string;

import java.util.Arrays;

public class SortAscendingOrder
{

	public static void main(String[] args)
	{
			String str[]= {"Mude","Java","Balaji","Velocity","Pune"};
			String temp="null";
			for(int i=0;i<=str.length-1;i++)
			{
				for(int j=i+1;j<str.length;j++)
				{
					if(str[i].compareTo(str[j])>0)
					{
						temp=str[i];
						str[i]=str[j];
						str[j]=temp;
					}
				}
			}
		System.out.println(Arrays.toString(str));
	}	
}

