package Exercicios.TwoExercise;

import java.util.Scanner;

public class soma {
	
	public static void main(String[] args) {
		
//		Exemplo 1:
//		System.out.println(67 + 33);
		
//		Exemplo 2:
//		int primeiroNumero = 33;
//		int segundoNumero = 66;
//		int soma = primeiroNumero + segundoNumero;
//		System.out.println("Resultado: " + soma);
//		
		
//		Exemplo 3:
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		int primeiroNumero = input.nextInt();
		System.out.print("Digite o segundo número: ");
		int segundoNumero = input.nextInt();
		int soma = primeiroNumero + segundoNumero;
		System.out.println("Soma: " + soma);
	}
}
