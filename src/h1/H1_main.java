package h1;

public class H1_main {
	public static void main(String[] args) {

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
