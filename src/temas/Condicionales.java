package temas;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {

		Scanner consola = new Scanner(System.in);

		// E1
		int edad = 0, mayorEdad = 18;
		System.out.println("Ingrese su edad");
		edad = consola.nextInt();

		if (edad >= mayorEdad) {
			System.out.println("Usted es mayor de edad");
		} else {
			System.out.println("Usted es menor de edad ");
		}

		// E2
		float dividendo, divisor, resultado;

		System.out.println("\nIngrese dividendo");
		dividendo = consola.nextFloat();
		System.out.println("Ingrese el divisor");
		divisor = consola.nextFloat();
		resultado = dividendo / divisor;

		if (divisor == 0) {
			System.out.println("¡Error! no se puede dividir entre 0");
		} else {
			System.out.println("Es resultado de la division es: " + resultado);
		}

		// E3
		int numero;

		System.out.println("Ingrese un numero entero");
		numero = consola.nextInt();

		if (numero % 2 == 0) {
			System.out.println("El numero" + numero + " es par");
		} else {
			System.out.println("El numero" + numero + " es impar");
		}

		// E4
		float edad5, ingresos;

		System.out.println("Ingrese su edad");
		edad5 = consola.nextFloat();
		System.out.println("Digite sus ingresos mensuales");
		ingresos = consola.nextFloat();

		if (edad > 16 && ingresos >= 1000) {
			System.out.println("Usted debe tributar");
		} else {
			System.out.println("Usted no debe tributar");
		}

		// E5
		float renta;

		System.out.println("Cuanto paga de renta anual?");
		renta = consola.nextFloat();

		if (renta < 10000) {
			System.out.println("Su impositivo es de 5%");
		} else if (renta >= 10000 && renta <= 20000) {
			System.out.println("Su impositivo es de 15%");
		} else if (renta >= 20000 && renta <= 35000) {
			System.out.println("Su impositivo es de 20%");
		} else if (renta >= 35000 && renta <= 60000) {
			System.out.println("Su impositivo es de 30%");
		} else {
			System.out.println("Su impositivo es de 45%");
		}

		// E6
		int edad6;

		System.out.println("Ingrese su edad");
		edad6 = consola.nextInt();

		if (edad6 < 4) {
			System.out.println("Su entrada es gratuita");
		} else if (edad6 >= 4 && edad6 <= 18) {
			System.out.println("El valor de la entrada es de 5 euros");
		} else {
			System.out.println("El valor de la entrada es de 10 euros");
		}

		// E7
		String vegetariano, noVegetariano, decision, adicionalV, adicionalNV;
		final String establecido = "Mozzarella y Tomate";

		System.out.println("Desea usted una pizza vegetariana o no vegetarina?");
		decision = consola.nextLine();

		if (decision == "vegetariana") {
			System.out.println("Elija un ingrediente adicional: Pimienta o Tofu");
			adicionalV = consola.nextLine();
			if (adicionalV == "Pimienta") {
				System.out.println("Su pizza lleva Pimienta, " + establecido);
			} else {
				System.out.println("Su pizza es vegetariana y lleva Tofu, " + establecido);
			}
		} else {
			System.out.println("Elija un ingrediente adicional : Peperoni, Jamon, o Salmon ");
			adicionalNV = consola.nextLine();

			if (adicionalNV == "Peperoni") {
				System.out.println("Su pizza no es vegetariana lleva Peperoni, " + establecido);
			} else if (adicionalNV == "Jamon") {
				System.out.println("Su pizza no es vegetariana lleva Jamon, " + establecido);
			} else {
				System.out.println("Su pizza no es vegetariana lleva Salmon, " + establecido);
			}
		}
		
		
	}
}
