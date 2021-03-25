package basicLevel.Exercice.ExerciceNineteen;

import java.util.Scanner;

public class decimalParaBinario {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Insira um número decimal: ");
		int decimal = input.nextInt();
		
		String binario = Integer.toBinaryString(decimal);
		System.out.println("O número binário é: " + binario);
	}
}