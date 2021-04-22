package basicLevel.Exercice.ExerciceFive;

import java.util.Scanner;

public class multiplicacao {
	
	private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	
		System.out.println("Digite o primeiro número: ");
		int primeiroNumero = input.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int segundoNumero = input.nextInt();
		
		int calculaMultiplicacao = primeiroNumero * segundoNumero;
		System.out.println("Resultado: \n"
		+ primeiroNumero + " X " + segundoNumero + " = " + calculaMultiplicacao);
	}		
}