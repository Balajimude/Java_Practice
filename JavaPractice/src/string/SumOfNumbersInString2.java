package string;

public class SumOfNumbersInString2 {

    public static void main(String[] args) {
        String str = "India requires 30 runs from 17 balls to win the world cup";
        int sum = 0;
        String s[] = str.split(" ");
        
        for (String str1 : s) {
            try {
                int num = Integer.parseInt(str1);
                System.out.println(num);
                sum = sum + num;
            } catch (NumberFormatException e) {
                // Not a number, continue
            }
        }
        
        System.out.println("Sum of numbers: " + sum);
    }

}
