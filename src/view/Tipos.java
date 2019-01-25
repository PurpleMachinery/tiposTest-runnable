package view;

import java.util.ArrayList;
import java.util.List;

public class Tipos {
	private static void print(Object var) {
		System.out.println(var.toString());
	}

	public static void main(String args[]) {
		/*
		 * for(byte i=0;;i++) { System.out.println(i); if(i<0) break; }
		 */
		/*
		 * byte ii = -128; System.out.println(ii); ii = 127; System.out.println(ii);
		 */
		int primos = 0;
		List<Integer> numeros = new ArrayList<Integer>();
		List<Integer> numerosPrimos = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			numeros.add(i);
		}
		long tempoInit = System.currentTimeMillis();
		for (Integer i : numeros) {
			int contador = 0;
			for (int u = 1; u <= i; u++) {
				if (i % u == 0) {
					contador++;
				}
			}
			if (contador == 2) {
				primos++;
				numerosPrimos.add(i);
			}
		}
		for (Integer aa : numerosPrimos) {
			print(aa + " é primo");
		}

		print("tempo total em milli: " + (System.currentTimeMillis() - tempoInit));
		print("tempo total em seg: " + ((System.currentTimeMillis() - tempoInit) / 1000));
		print("tem " + primos + " numeros primos");
	}
}
