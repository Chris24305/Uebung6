package h2;

public class H2_main {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 }, b = { 1, 2, 3, 5 };
		boolean identical = compareArrays(a, b);
		System.out.print(identical);
	}

	public static boolean compareArrays(int[] A, int[] B) {
		boolean compareArrays = false;
		if (A.length != B.length) {
			compareArrays = false;
		} else {
			for (int m = 0; m < A.length; m++) {
				if (A[m] == B[m]) {
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
