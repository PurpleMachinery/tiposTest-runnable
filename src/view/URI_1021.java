package view;

import java.math.BigDecimal;
import java.util.Scanner;

public class URI_1021 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		BigDecimal d = scanner.nextBigDecimal();
		int n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0;
		int m1 = 0, m050 = 0, m025 = 0, m010 = 0, m005 = 0, m001 = 0;

		while (d.doubleValue() > 0) {
			if (d.doubleValue() - 100 >= 0) {
				n100++;
				d = d.subtract(new BigDecimal(100));
			} else if (d.doubleValue() - 50 >= 0) {
				n50++;
				d = d.subtract(new BigDecimal(50));
			} else if (d.doubleValue() - 20 >= 0) {
				n20++;
				d = d.subtract(new BigDecimal(20));
			} else if (d.doubleValue() - 10 >= 0) {
				n10++;
				d = d.subtract(new BigDecimal(10));
			} else if (d.doubleValue() - 5 >= 0) {
				n5++;
				d = d.subtract(new BigDecimal(5));
			} else if (d.doubleValue() - 2 >= 0) {
				n2++;
				d = d.subtract(new BigDecimal(2));
			} else if (d.doubleValue() - 1 >= 0) {
				m1++;
				d = d.subtract(new BigDecimal(1));
			} else if (d.doubleValue() - 0.50 >= 0) {
				m050++;
				d = d.subtract(new BigDecimal(0.5));
			} else if (d.doubleValue() - 0.25 >= 0) {
				m025++;
				d = d.subtract(new BigDecimal(0.25));
			} else if (d.doubleValue() - 0.10 >= 0) {
				m010++;
				d = d.subtract(new BigDecimal(0.10));
			} else if (d.doubleValue() - 0.05 >= 0) {
				m005++;
				d = d.subtract(new BigDecimal(0.05));
			} else {
				m001++;
				d = d.subtract(new BigDecimal(0.01));
			}
		}

		/* VAR PREset */
		String nts = " nota(s) de R$ ";
		String mts = " moeda(s) de R$ ";
		/* presentation */
		System.out.println("NOTAS:");
		System.out.println(n100 + nts + "100.00");
		System.out.println(n50 + nts + "50.00");
		System.out.println(n20 + nts + "20.00");
		System.out.println(n10 + nts + "10.00");
		System.out.println(n5 + nts + "5.00");
		System.out.println(n2 + nts + "2.00");

		System.out.println("MOEDAS:");
		System.out.println(m1 + mts + "1.00");
		System.out.println(m050 + mts + "0.50");
		System.out.println(m025 + mts + "0.25");
		System.out.println(m010 + mts + "0.10");
		System.out.println(m005 + mts + "0.05");
		System.out.println(m001 + mts + "0.01");

		scanner.close();
	}
}
