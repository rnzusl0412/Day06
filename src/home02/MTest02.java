package home02;

public class MTest02 {
	public static void f(int h, int k) {
		for (int i = h; i < k; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		f(2, 5);
		f(5, 10);
	}

}
