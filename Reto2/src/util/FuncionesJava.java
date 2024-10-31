package util;

import java.util.Scanner;

public class FuncionesJava {

	public static int dimeEntero(String texto, Scanner sc) {
		do {
			try {

				System.out.println(texto);
				String s = sc.nextLine();
				int num = Integer.parseInt(s);
				return num;
			} catch (Exception ex) {
				System.out.println("Formato Incorrecto");
			}
		} while (true);

	}

	public static double dimeDouble(String texto, Scanner sc) {
		do {
			try {

				System.out.println(texto);
				String s = sc.nextLine();
				double num = Double.parseDouble(s);
				return num;
			} catch (Exception ex) {
				System.out.println("Formato Incorrecto");
			}
		} while (true);
	}
}