package arrays;

public class MaxAndMin {

    public static void main(String[] args) {
        int a[] = {10, 32, 5, 102, 36, 9, 100};

        int max = a[0]; // Initialize max to the first element
        int min = a[0]; // Initialize min to the first element

        for (int i = 0; i < a.length; i++) { // Start loop from the second element
            if (a[i] > max) {
                max = a[i]; // Update max if current element is greater
            }
            if (a[i] < min) {
                min = a[i]; // Update min if current element is smaller
            }
        }

        System.out.println("Max number is: " + max);
        System.out.println("Min number is: " + min);
    }
}
