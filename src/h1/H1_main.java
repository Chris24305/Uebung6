package h1;

public class H1_main {
	public static void main(String[] args) {
		int[] e = { 7,6,5,3,2,1 };
		int[] d = { 1,2,3,5,6,7 };
		boolean c=isMirrorArray(e,d);
		System.out.println(c);
	}
	public static boolean isMirrorArray(int[] a, int[] b) {
		boolean isMirrorArray = false;
		for (int m = 0, n = 0; n < b.length && m < a.length; m++, n++) {
			if (a[m] == b[b.length - 1 - n]) {
				isMirrorArray = true;
				continue;
			} else {
				isMirrorArray = false;
				break;
			}
		}
		return isMirrorArray;
	}
}
