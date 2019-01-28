package view;

import java.util.Scanner;

public class URI_1036 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();
		double delta = (b * b) - (4 * a * c);
		double raizDelta = Math.sqrt(delta);
		Double x1 = (-b + raizDelta) / (2 * a);
		Double x2 = (-b - raizDelta) / (2 * a);
		if ((x1.isInfinite() || x1.isNaN()) || (x2.isInfinite() || x2.isNaN())) {
			System.out.println("Impossivel calcular");
		} else {
			System.out.println(String.format("R1 = %.5f", x1));
			System.out.println(String.format("R2 = %.5f", x2));
		}
	}
}
