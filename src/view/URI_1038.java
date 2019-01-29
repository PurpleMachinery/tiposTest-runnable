package view;

import java.util.Scanner;

public class URI_1038 {
	public static void main(String[] args) {
		double itens[][] = {
				{1, 4},
				{2, 4.5},
				{3, 5},
				{4, 2},
				{5, 1.5},
		};		
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(), b= scanner.nextInt();
		
		System.out.println(String.format("Total: R$ %.2f", (itens[a-1][1]*b)));
		scanner.close();
	}
}
