package lista05;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);   
		 int[][] matriz = new int[3][3];
		 
		 int somaDiagonalPrincipal = 0;
		 int somaDiagonalSecundaria = 0;
		 
		 System.out.println("Digite os elementos da matrix 3x3:");
		 for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				matriz[x][y] = scanner.nextInt();
			 	}
		 }
			System.out.println("Elementos da Diagonal Principal:");
	        for (int contador = 0; contador < matriz.length; contador++) {
	            System.out.print(matriz[contador][contador] + " ");
	            somaDiagonalPrincipal += matriz[contador][contador];
	        }
	            
	            System.out.println("\nElementos da Diagonal Secundária:");
	            for (int contador1 = 0; contador1 < 3; contador1++) {
	                System.out.print(matriz[contador1][2 - contador1] + " ");
	                somaDiagonalSecundaria += matriz[contador1][2 - contador1];
	            }
	            
	            System.out.println("\nSoma de todos os elementos da Diagonal Principal: " + somaDiagonalPrincipal);
	            
	            System.out.println("\nSoma de todos os elementos da Diagonal Secundária: " + somaDiagonalSecundaria);
	    		} 
	        }


