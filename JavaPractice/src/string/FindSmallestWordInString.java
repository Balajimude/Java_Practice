package string;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

public class FindSmallestWordInString {
    public static void main(String[] args) {
        String s = "Hardships often prepare ordinary people for an extraordinary destiny";
        String[] split = s.split(" ");
        LinkedHashMap<String, Integer> wordLengths = new LinkedHashMap<>();

        // Store each word and its length in a LinkedHashMap
        for (String str : split) {
            wordLengths.put(str, str.length());
        }

        // Get the values (word lengths) as a list
        ArrayList<Integer> lengths = new ArrayList<>(wordLengths.values());

        // Sort the list of lengths
        Collections.sort(lengths);

        // Find the smallest length
        int smallestLength = lengths.get(0);
        int maxlength=lengths.get(lengths.size()-1);

        // Iterate over the LinkedHashMap to find the words with the smallest length
        for (String word : wordLengths.keySet()) {
            if (wordLengths.get(word) == smallestLength) {
                System.out.println("Smallest word(s): " + word);
            }
            else if (wordLengths.get(word) == maxlength)
            {
            	System.out.println("maxlength word(s): " + word);
            }
        }
    }
}


