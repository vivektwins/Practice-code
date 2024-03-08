package Test.Integer;

import java.util.Arrays;

public class SwitchAlternateNumbersInArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				continue;
			}

			temp = a[i - 1];
			a[i - 1] = a[i];
			a[i] = temp;

		}
		System.out.println(Arrays.toString(a));
	}

}
