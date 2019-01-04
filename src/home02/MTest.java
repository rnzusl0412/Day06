package home02;

public class MTest {
	public static void f() { // f 라는 함수를 정의
		for (int i = 5; i < 10; i ++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		f(); // method(함수)를 호출 (사용)
		f();
	}

}
