package temas;

import java.util.Scanner;

public class IntentoEjemplo10 {

	public static void main(String[] args) {

		Scanner consola = new Scanner(System.in);
		
		
		int comida, menuVegetariano, menuNoVegetariano;
		final String establecido = "mozzarella y tomate";
		
		System.out.println("Elija su pizza: \n1. Vegetariana \n2. No vegetariana \n0. Salir");
		comida = consola.nextInt();
		
		
		switch(comida) {
		case 1:
			System.out.println("Selecciono pizza vegetariana");
			System.out.println("Selecione \n1.Pimiento \n2 Tofu");
			menuVegetariano = consola.nextInt();
				switch (menuVegetariano) {
				case 1: 
					System.out.println("Su pizza es vegetariana y lleva pimiento, " + establecido);
					break;
					
				case 2: 
					System.out.println("Su pizza es vegetariana y lleva tofu, " + establecido);
					break;
					
				default :
					System.out.println("¡Ups! la opcion es invalida");
					break;
				}
		
			break;
		
		case 2 : 
			System.out.println("Selecciono pizza no vegetariana");
			System.out.println("Seleccione \n1.Peperoni \n2. Jamon \n3. Salmon");
			menuNoVegetariano = consola.nextInt();
			
				switch (menuNoVegetariano) {
				case 1 : 
					System.out.println("Su pizza no es vegetariana y lleva peperoni, " + establecido);
					break;
					
				case 2 : 
					System.out.println("Su pizza no es vegetariana y lleva jamon, " + establecido);
					break;
					
				case 3: 
					System.out.println("Su pizza no es vegetariana y lleva salmon, " + establecido);
					break;
					
				default :
					System.out.println("¡Ups! la opcion es invalida");
					break;
				}
				
			break;
			
		case 0: 
			System.out.println("Gracias por visitarnos");
			break;
			
		default:
			System.out.println("La opcion que registro es invalida");
			break;
		}
		
	
	}	
}
