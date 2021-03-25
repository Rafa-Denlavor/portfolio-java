package basicLevel.Exercice.ExerciceTwentyOne;

import java.util.Scanner;

public class decimalParaOctal {
	
	private static Scanner input = new Scanner(System.in);
			
	public static void main(String[] args) {
		
		System.out.println("Insira um decimal: ");
		int decimal = input.nextInt();
		
		String octal = Integer.toOctalString(decimal);
		System.out.println("O número octal é: " + octal);
	}
}