package lista05;

import java.util.Scanner;

public class ExercicioVetor01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numeros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		System.out.println("Digite o número que você deseja encontrar:");
		int numeroProcurado = leia.nextInt();
		
		boolean encontrado = false;
		
		for(int i = 0; i < numeros.length; i++) {	
		
		if (numeros[i] == numeroProcurado ) {
			System.out.println("\nO número " + numeroProcurado + " está localizado na Posição: " + i);
			encontrado = true;
			break;
		}
	}
		if (!encontrado) {
			System.out.println("\nO número " + numeroProcurado + " não foi encontrado!");
			}
	
	}
}
