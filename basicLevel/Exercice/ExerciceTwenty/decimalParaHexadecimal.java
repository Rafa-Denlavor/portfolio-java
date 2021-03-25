package basicLevel.Exercice.ExerciceTwenty;

import java.util.Scanner;

public class decimalParaHexadecimal {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Insira um número decimal: ");
		int decimal = input.nextInt();
		
		String hexadecimal = Integer.toHexString(decimal);
		System.out.println("O número hexadecimal é: " + hexadecimal);
	}
}