package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class FirstRepeatingElementInArray {

    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 7, 3, 4, 8};

        HashMap<Integer, Integer> map = new HashMap<>();

        // First pass: Populate the HashMap with element frequencies
        for (int i : arr) {
            if (map.containsKey(i)) 
            {
            	int count=map.get(i);
                map.put(i, ++count);
            }
            else 
            {
                map.put(i, 1);
            }
        }

        // Second pass: Find the first element based on its first occurrence that repeats
        for (int i : arr) {
            if (map.get(i) > 1) {
                System.out.println("First Repeating Element Based on First Occurrence: " + i);
                break;
            }
        }
        
        //Given an array of integers, find the largest number that does 
        //not have any duplicates in the array.
        
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--)
        {
        	if(map.get(arr[i])<2)
        	{
        		System.out.println(arr[i]);
        		break;
        	}
        }
    }
    
    
}
