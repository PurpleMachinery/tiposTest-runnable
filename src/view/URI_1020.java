package view;

import java.util.Scanner;

public class URI_1020 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int varInput = scanner.nextInt();
		int ano = 0, mes = 0, dia = 0;
		for (;;) {
			if (varInput - 365 >= 0) {
				varInput -= 365;
				ano++;
				continue;
			} else if (varInput - 30 >= 0) {
				varInput -= 30;
				mes++;
				continue;
			} else {
				dia = varInput;
				varInput = 0;
				break;
			}
		}
		System.out.println(ano+" ano(s)");	
		System.out.println(mes+" mes(es)");	
		System.out.println(dia+" dia(s)");		
	}
}
