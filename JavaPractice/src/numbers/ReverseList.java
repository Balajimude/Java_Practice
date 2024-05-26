package numbers;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ls=new ArrayList<Integer>();
		ls.add(12);
		ls.add(23);
		ls.add(89);
		ls.add(9);
		ls.add(10);
		System.out.println(ls);
		List<Integer> reverselst=new ArrayList<Integer>();
		for(int i=ls.size()-1;i>=0;i--)
		{
			reverselst.add(ls.get(i));
		}
		System.out.println(reverselst);

	}

}
