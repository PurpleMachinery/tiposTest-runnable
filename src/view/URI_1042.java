package view;

import java.util.Arrays;
import java.util.Scanner;

public class URI_1042 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n[] = { input.nextInt(), input.nextInt(), input.nextInt() };
		int nn[] = n.clone();
		Arrays.sort(nn);
		for (int a : nn) {
			System.out.println(a);
		}
		System.out.println();
		for (int a : n) {
			System.out.println(a);
		}
		input.close();
	}
}
