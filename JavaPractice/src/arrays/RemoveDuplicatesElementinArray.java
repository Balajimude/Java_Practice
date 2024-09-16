package arrays;

import java.util.ArrayList;

public class RemoveDuplicatesElementinArray {

	void usingForLoop() {
		int a[] = { 10, 20, 40, 30, 30, 20, 10, 60, 50 };
		int b[] = new int[a.length];
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < count; j++) {
				if (a[i] == b[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				b[count] = a[i];
				count++;
			}
		}

		// Print the array without duplicates
		for (int i = 0; i < count; i++) {
			System.out.println(b[i]);
		}
	}

	void usingArrayList() {
		int a[] = { 10, 20, 40, 30, 30, 20, 10, 60, 50 };
		ArrayList<Integer> uniqueElement = new ArrayList<>();

		for (int no : a) {
			if (!uniqueElement.contains(no)) {
				uniqueElement.add(no);
			}
		}

		for (int ele : uniqueElement) {
			System.out.println(ele);
		}
	}
	public static void main(String[] args) {

		RemoveDuplicatesElementinArray rda = new RemoveDuplicatesElementinArray();
		rda.usingArrayList();
		// rda.usingForLoop();
	}
}
