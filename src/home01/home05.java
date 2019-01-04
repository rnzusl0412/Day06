package home01;

class score {
	public int a;
	public int b;
	public String name;
}

public class home05 {

	public static void main(String[] args) {
		score k = new score();
		System.out.println(k);

		k.a = 95;
		k.b = 100;
		k.name = "김국현";
		System.out.println(k.name + "은 국어점수가 " + k.a + " 수학점수가 " + k.b + " 입니다.");
		
		double a = 3.14159265/4;
		double s  = Math.tan(a);
		System.out.printf("%5.10f",s);
	}
}
