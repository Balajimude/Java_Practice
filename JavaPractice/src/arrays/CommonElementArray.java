package arrays;

public class CommonElementArray {

    public static void main(String[] args) {
        int a[] = {5, 10, 12, 9, 25, 9, 8};
        int b[] = {6, 8, 9, 14, 24, 36, 9};

        System.out.print("Common Elements: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                    break; // Break after finding a common element
                }
            }
        }
    }
}
