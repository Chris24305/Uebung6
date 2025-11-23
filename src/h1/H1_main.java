package h1;

public class H1_main {
	public static void main(String[] args) {
		int[] c = { 7, 6, 5, 4, 3, 2, 1 };
		int[] d = { 1, 2, 3, 4, 5, 6, 7 };
		boolean e = isMirrorArray(c, d);
		System.out.println(e);
	}

	public static boolean isMirrorArray(int[] a, int[] b) {
		boolean isMirrorArray = false;
		if (a.length != b.length) {
			isMirrorArray = false;
		} else {
			for (int m = 0, n = 0; n < b.length && m < a.length; m++, n++) {
				if (a[m] == b[b.length - 1 - n]) {
					isMirrorArray = true;
					continue;
				} else {
					isMirrorArray = false;
					break;
				}
			}
		}
		return isMirrorArray;
	}
}
