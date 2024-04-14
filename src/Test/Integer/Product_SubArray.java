package Test.Integer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Product_SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { -1, 7, 0, 5, 6 };
		ArrayList<Integer> as = new ArrayList<Integer>();
		Set<Integer> treeSet = new TreeSet<>();

		for (int i = 0; i < a.length - 1; i++) {
			int n = 1, j = 0;

			if (i != j) {

				for (j = 0; j < a.length; j++) {
					if (a[j] == 0) {
						n *= a[j];

						as.add(n);
						n = 1;
					} else {
						n *= a[j];

						as.add(n);
					}
					// System.out.println(as);

				}
			}

		}
		

		Collections.sort(as);
		//System.out.println(as);
		System.out.println(as.get(as.size() - 1));

	}

}
