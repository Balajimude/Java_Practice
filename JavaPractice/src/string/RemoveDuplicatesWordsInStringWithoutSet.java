package string;

import java.util.ArrayList;

public class RemoveDuplicatesWordsInStringWithoutSet {

    public static void main(String[] args) {
        String s = "Welcome to java Welcome to selenium selenium balaji";
        String split[] = s.split(" ");
        ArrayList<String> uniqueWords = new ArrayList<>();

        for (String word : split) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }
        }

        for (String str : uniqueWords) {
            System.out.println(str);
        }
    }
}


