package arrays;

import java.util.HashMap;

public class FirstRepeatingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1, 5, 3, 4, 5, 3, 6};
		
		HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
		
		for(int i:arr)
		{
			if(hm.containsKey(i))
			{
				int count=hm.get(i);
				hm.put(i, ++count);
			}
			else
			{
				hm.put(i, 1);
			}
		}
		System.out.println(hm);
		
		for(int n:hm.keySet())
		{
			int value=hm.get(n);
			if(value>1)
			{
				System.out.println("First Reapeating Element"+" "+n);
				break;
			}
		}
	}

}
