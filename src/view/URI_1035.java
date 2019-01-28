package view;

import java.util.Scanner;

public class URI_1035 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt(), d = scanner.nextInt();
		if (b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}
	}
}
