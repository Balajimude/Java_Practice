package string;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class SortingBasedOnLengthOfWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hardships often prepare ordinary people for an extraordinary destiny";
		String[] split = s.split(" ");
		HashMap<String, Integer> wordLengths = new HashMap<>();

		// Store each word and its length in a LinkedHashMap
		for (String str : split) {
			wordLengths.put(str, str.length());
		}

		// Get the values (word lengths) as a list
		ArrayList<Integer> lengths = new ArrayList<>(wordLengths.values());

		// Sort the list of lengths
		Collections.sort(lengths);

		for (int i = 0; i < lengths.size(); i++) {
			int value = lengths.get(i);

			for (String s1 : wordLengths.keySet()) {
				if (wordLengths.get(s1) == value) {
					System.out.println(s1 + " ," + value);
				}
			}
		}
	}

}
