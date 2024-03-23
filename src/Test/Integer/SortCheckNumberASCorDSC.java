package Test.Integer;

public class SortCheckNumberASCorDSC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 7, 6 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = i; j < a.length; j++) {
				if (a[i] <= a[j]) {

				} else {

					count++;
					break;

				}

			}

		}
		if (count != 0) {
			System.out.println("not in order");
		} else {
			System.out.println("in order");
		}

	}

}
