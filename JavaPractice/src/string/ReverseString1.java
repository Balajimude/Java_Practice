package string;

public class ReverseString1 {

    public static void main(String[] args) {
        String s = "ABC  PQR MUDE";
        String temp = "";

        // Reverse the string
        for (int i = s.length() - 1; i >= 0; i--) {
            temp = temp + s.charAt(i);
        }
        System.out.println(temp);

        // Use StringBuilder to efficiently modify the string
        StringBuilder stringBuilder = new StringBuilder(temp);

        // Iterate over the original string
        for (int i = 0; i < s.length(); i++) {
            // If the character is a space, insert a space in the reversed string after the word
            if (s.charAt(i) == ' ') {
                stringBuilder.insert(i + 1, ' ');
            }
        }

        // Convert StringBuilder back to String
        String stringWithSpace = stringBuilder.toString();
        System.out.println(stringWithSpace);
    }
}
