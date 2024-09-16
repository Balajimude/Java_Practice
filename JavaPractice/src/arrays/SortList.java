package arrays;

import java.util.ArrayList;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {23,45,8,43,100,56,3,5,80};
		
		List<Integer> lst=new ArrayList<Integer>();
        for(int n:a)
        {
        	lst.add(n);
        }
        System.out.println(lst);
        for(int i=0;i<lst.size();i++)
        {
        	for(int j=i+1;j<lst.size();j++)
        	{
        		if(lst.get(i)>lst.get(j))
        		{
        			int temp=lst.get(i);
        			lst.set(i,lst.get(j));
        			lst.set(j, temp);
        		}
        	}
        }
        System.out.println(lst);
	}
}
