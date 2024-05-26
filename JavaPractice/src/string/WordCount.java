
package string;
import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String s1 = "Welcome to java Welcome to selenium";
        String[] split = s1.split(" ");

        HashMap<String, Integer> hms = new HashMap<String, Integer>();

        for (String str : split) {
            if (hms.containsKey(str)) {
                int count = hms.get(str);
                hms.put(str, ++count);
            } else {
                hms.put(str, 1);
            }
        }
        System.out.println(hms);
    }
}

