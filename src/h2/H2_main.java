package h2;

public class H2_main {
	public static void main(String[] args) {
	/*	int[] a = { 1, 2, 3, 4 }, b = { 1, 2, 3, 4 };
		boolean identical = compareArrays(a, b);
		System.out.print(identical); */
	}

	public static boolean compareArrays(int[] a, int[] b) {
		boolean compareArrays = false;
		if (a.length != b.length) {
			compareArrays = false;
		} else {
			for (int m = 0; m < a.length; m++) {
				if (a[m] == b[m]) {
					compareArrays = true;
					continue;
				} else {
					compareArrays = false;
					break;
				}
			}
		}
		return compareArrays;
	}
}
