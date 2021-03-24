package basicLevel.Exercice.ExerciceSix;

import java.util.Scanner;

public class operacoes {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
//		Exemplo 1:
		
		System.out.print("Insira o primeiro número: ");
		int primeiroNumero = input.nextInt();
		
		System.out.print("Insira o segundo número: ");
		int segundoNumero = input.nextInt();
		
		System.out.println("Resultado: \n");
		System.out.println(primeiroNumero + " + " + segundoNumero + " = " + (primeiroNumero + segundoNumero));
		System.out.println(primeiroNumero + " - " + segundoNumero + " = " + (primeiroNumero - segundoNumero));
		System.out.println(primeiroNumero + " X " + segundoNumero + " = " + (primeiroNumero * segundoNumero));
		System.out.println(primeiroNumero + " / " + segundoNumero + " = " + (primeiroNumero / segundoNumero));
		System.out.println(primeiroNumero + " mod " + segundoNumero + " = " + (primeiroNumero % segundoNumero));
		
//		Exemplo 2:
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("Insira o primeiro número: ");
//		int primeiroNumero = input.nextInt();
//		
//		System.out.print("Insira o segundo número: ");
//		int segundoNumero = input.nextInt();
//		
//		int calculoSoma = primeiroNumero + segundoNumero;
//		int calculoSubtracao = primeiroNumero - segundoNumero;
//		int calculoMultiplicacao = primeiroNumero * segundoNumero;
//		int calculoDivisao = primeiroNumero / segundoNumero;
//		int calculoRestante = primeiroNumero % segundoNumero;
//		
//		System.out.println("Resultado: \n");
//		System.out.println(primeiroNumero + " + " + segundoNumero + " = " + calculoSoma);
//		System.out.println(primeiroNumero + " - " + segundoNumero + " = " + calculoSubtracao);
//		System.out.println(primeiroNumero + " X " + segundoNumero + " = " + calculoMultiplicacao);
//		System.out.println(primeiroNumero + " / " + segundoNumero + " = " + calculoDivisao);
//		System.out.println(primeiroNumero + " mod " + segundoNumero + " = " + calculoRestante);	
	}
}
