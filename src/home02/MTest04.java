package home02;
public class MTest04 {
	public static String f(int a, int b) {
		int i = a;
		String output = "";
		while (i < b) {
			output = output + i*3 + " ";
			i++;
		}
		return output;
	}

	public static void main(String[] args) {
		String k = f(3, 15);
		System.out.println(k);
	}
}
