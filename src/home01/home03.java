package home01;

public class home03 {
	public static void main(String[] args) {
		String[] k = {"�豹��", "������", "�ڼ���"};
		for (int i = 0; i < k.length; i++) {
			String h = k[i];
			System.out.println(h + "�� ����� �޾ҽ��ϴ�.");
		}
		
		for (String e : k) {
			System.out.println(e + "�� ����� �޾ҽ��ϴ�.");
		}
		System.out.println(k[3]);
	}
}
