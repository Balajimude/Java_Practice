package numbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Input: List = [1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5]
		//Output: List = [1, 10, 2, 3, 4, 5]

		List<Integer>lst=new ArrayList<Integer>();
		lst.add(1);
		lst.add(10);
		lst.add(2);
		lst.add(2);
		lst.add(10);
		lst.add(3);
		lst.add(3);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(5);
		lst.add(7);
		System.out.println(lst);
		
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int a:lst)
		{
			hs.add(a);
		}
		System.out.println(hs);	
		List<Integer> l=new ArrayList<Integer>();
		for(int a:lst)
		{
			if(!l.contains(a))
			{
				l.add(a);
			}
		}
		System.out.println(l);
		
	}
	

	
}

