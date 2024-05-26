package arrays;

import java.util.HashSet;

public class RemoveDuplicatesElementinArrayUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10, 20, 40, 30, 30, 20, 10, 60, 50};
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for(int no:a)
		{
			hs.add(no);
		}
		System.out.println(hs);
	}

}
