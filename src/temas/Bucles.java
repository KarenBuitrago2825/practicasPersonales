package temas;

import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {

		Scanner consola = new Scanner(System.in);

		// Bucle for
		int contador;
		System.out.println("Digite el numero");
		contador = consola.nextInt();
		for (int x = 1; x <= contador; x++) {
			System.out.println(x);
		}

		int a = 0, prueba = 0;
		for (a = 0; prueba >= 1; a--) {
			System.out.println(a);
		}

		// Bucle while
		int y = 0, entrada;

		System.out.println("Ingrese un numero");
		entrada = consola.nextInt();

		while (y < entrada) {
			y++;
			System.out.println(y);
		}

		// Bucle do-while
		int z = 0, entrada2;

		System.out.println("Ingrese un numero");
		entrada2 = consola.nextInt();

		do {
			System.out.println(z);
			z++;
		} while (z < entrada2);

		// Realizar un programa que imprima= 1, 2, 3, 4, 5

		for ( int numero = 1; numero <= 5; numero++) {
			System.out.print(numero + ", ");
		}
	}

}
