package home02;

public class MTest03 {
	public static String f(int a, int b) {	//�޼ҵ��� �̸� f
		int i = a;		//String �� f�� field
		String output = "";
		while (i < b) {
			output = output + i*2;
			i++;
		}
		return output;
	}

	public static void main(String[] args) {	//void �� �����  main�� ���ϰ��� ����x
		String k = f(1, 5);		//f�� String �̴�.
		System.out.println(k);
	}

}
