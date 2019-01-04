package home02;

public class MTest03 {
	public static String f(int a, int b) {	//메소드의 이름 f
		int i = a;		//String 은 f의 field
		String output = "";
		while (i < b) {
			output = output + i*2;
			i++;
		}
		return output;
	}

	public static void main(String[] args) {	//void 는 빈공간  main의 리턴값은 존재x
		String k = f(1, 5);		//f는 String 이다.
		System.out.println(k);
	}

}
