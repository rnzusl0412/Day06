package home01;

public class home03 {
	public static void main(String[] args) {
		String[] k = {"김국현", "정예빈", "박세진"};
		for (int i = 0; i < k.length; i++) {
			String h = k[i];
			System.out.println(h + "이 상담을 받았습니다.");
		}
		
		for (String e : k) {
			System.out.println(e + "이 상담을 받았습니다.");
		}
		System.out.println(k[3]);
	}
}
