package basicLevel.Exercice.ExerciceSeven;

import java.util.Scanner;

public class tabuada {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
//		Exemplo 1:
		
		System.out.print("Insira um número para ver a sua tabuada: ");
		int numero = input.nextInt();
		
		for(int i = 0; i < 11; i++) {
			System.out.println(numero + " x " + i + " = " + (numero*i));
		}
		
		
//		Exemplo 2:
//		System.out.print("Digite um número para ver sua tabuada: ");
//		int numero = input.nextInt();
//		
//		System.out.println(numero + " x 0 = " + (numero * 0));
//		System.out.println(numero + " x 1 = " + (numero * 1));
//		System.out.println(numero + " x 2 = " + (numero * 2));
//		System.out.println(numero + " x 3 = " + (numero * 3));
//		System.out.println(numero + " x 4 = " + (numero * 4));
//		System.out.println(numero + " x 5 = " + (numero * 5));
//		System.out.println(numero + " x 6 = " + (numero * 6));
//		System.out.println(numero + " x 7 = " + (numero * 7));
//		System.out.println(numero + " x 8 = " + (numero * 8));
//		System.out.println(numero + " x 9 = " + (numero * 9));
//		System.out.println(numero + " x 10 = " + (numero * 10));
		
		
	}

}