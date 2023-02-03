package temas;

public class EjercicioBreve {

	public static void main(String[] args) {

		int num = 35, num2 = 20, aux;

		System.out.println("------Antes------");
		System.out.println("Num: " + num);
		System.out.println("Num2: " + num2);

		aux = num2;
		num2 = num;
		num = aux;
		
		System.out.println("------Despues------");
		System.out.println("Num: " + num);
		System.out.println("Num2: " + num2);
	}
}
