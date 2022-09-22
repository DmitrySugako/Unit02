package lt.lhu.unit02.main;

public class Task09 {

	public static void main(String[] args) {
		double x = 6;
		double fx;

		if (x <= -3) {
			fx = 9;
			System.out.println(fx);
		} else if (x > 3) {
			fx = 1 / Math.pow(x, 2) + 1;
			System.out.println(fx);
		} else {
			System.out.println("Диапазон некорректен");
		}

	}

}
