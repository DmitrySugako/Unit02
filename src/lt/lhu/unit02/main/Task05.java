package lt.lhu.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		double a = 12;
		double b = 22;
		double c = 27;
		double result;

		if (a == 0) {
			return;
		}

		result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - (Math.pow(a, 3) * c + b);

		System.out.println(result);
	}

}
