package lt.lhu.unit02.main;

public class Task07 {

	public static void main(String[] args) {
		double a = 1;
		double b = -2;
		double c = 4;

		if (a > 0) {
			a = Math.pow(a, 2);
		} else {
			a = Math.pow(a, 4);
		}
		if (b > 0) {
			b = Math.pow(b, 2);
		} else {
			b = Math.pow(b, 4);
		}
		if (c > 0) {
			c = Math.pow(c, 2);
		} else {
			c = Math.pow(c, 4);
		}
		System.out.println("a=" + a + " b=" + b + " c=" + c);
	}

}
