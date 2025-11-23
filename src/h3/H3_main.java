package h3;

public class H3_main {
	public static void main(String[] args) {
	/*	int[] A = { 3, 2, 3, 2, 1 };
		int[] B = { 1, 2, 2, 3, 3, 3 };
		boolean e = compareArraysVal(A, B);
		System.out.print(e);	*/
	}

	public static boolean compareArraysVal(int[] a, int[] b) {
		boolean ArrayVal = true;
		int d = 0;
		if (a.length != b.length) {
			return false;
		}
		for (int m = 0; m < a.length; m++) {
			for (int n = 0; n < a.length; n++) {
				if (a[m] == a[n]) {
					d++;
				}
				if (a[m] == b[n]) {
					d--;
				}
			}
			if (d == 0) {
				ArrayVal = true;
			} else {
				ArrayVal = false;
				break;
			}
		}
		return ArrayVal;
	}
}