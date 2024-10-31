package reto2;

import java.util.Scanner;

import util.FuncionesJava;

public class Funciones3 {

	public static void main(String[] args) {

	}

	public static double EfectivoED(double dinero) {
		double n = dinero * 1.09;
		return n;

	}

	public static double EfectivoDE(double dinero) {
		double n = dinero * 0.92;
		return n;

	}

	public static double AreaYM(double area) {
		double n = area * 0.836127;
		return n;

	}

	public static double AreaMY(double area) {
		double n = area * 1.19599;
		return n;

	}

	public static void EfecitivoM(Scanner sc) {
		int n = 0;
		do {
			do {
				do {
					try {
						System.out.println("Elige la conversión de efectivo:");
						System.out.println("1.Euros a dólares");
						System.out.println("2.Dólares a euros");
						System.out.println("0.Salir");

						FuncionesJava.dimeEntero(null, sc);
						break;

					} catch (Exception ex) {
						System.out.println("Introduce una opción correcta");
					}
				} while (true);
			} while (0 > n || n > 2);

			switch (n) {

			case 1:
				n = 1;
				int n1 = 0;

				do {
					try {
						System.out.println("Introduce euro");
						FuncionesJava.dimeEntero(null, sc);

						break;
					} catch (Exception ex) {
						System.out.println("Introduce un nº correcto");
					}
				} while (true);

				double resultado = Funciones3.EfectivoED(n1);
				System.out.println(resultado);
				break;

			case 2:
				n = 2;
				int n2 = 0;
				do {
					try {
						System.out.println("Introduce dólares");
						FuncionesJava.dimeEntero(null, sc);

						break;
					} catch (Exception ex) {
						System.out.println("Introduce un nº correcto");
					}
				} while (true);

				double resultado2 = Funciones3.EfectivoDE(n2);
				System.out.println(resultado2);
				break;
			}
		} while (n != 0);
		return;
	}

	public static void AreaM(Scanner sc) {
		int n = 0;
		do {
			do {
				do {
					try {
						System.out.println("Elige la conversión de area:");
						System.out.println("1.Yarda cuadrada a metro cuadrado");
						System.out.println("2.Metro cuadrado a yarda cuadrada");
						System.out.println("0.Salir");

						FuncionesJava.dimeEntero(null, sc);
						break;

					} catch (Exception ex) {
						System.out.println("Introduce una opción correcta");
					}
				} while (true);
			} while (0 > n || n > 2);

			switch (n) {

			case 1:
				n = 1;
				int n1 = 0;

				do {
					try {
						System.out.println("Introduce yardas cuadradas");
						FuncionesJava.dimeEntero(null, sc);

						break;
					} catch (Exception ex) {
						System.out.println("Introduce un nº correcto");
					}
				} while (true);

				double resultado = Funciones3.AreaYM(n1);
				System.out.println(resultado);
				break;

			case 2:
				n = 2;
				int n2 = 0;
				do {
					try {
						System.out.println("Introduce metros cuadrados");
						FuncionesJava.dimeEntero(null, sc);

						break;
					} catch (Exception ex) {
						System.out.println("Introduce un nº correcto");
					}
				} while (true);

				double resultado2 = Funciones3.AreaMY(n2);
				System.out.println(resultado2);
				break;
			}
		} while (n != 0);
		return;
	}

}
