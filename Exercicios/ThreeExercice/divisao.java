package Exercicios.ThreeExercice;

import java.util.Scanner;

public class divisao {
	public static void main(String[] args) {
		
//		Exemplo 1:
//		System.out.println(10 / 2);
		
//		Exemplo 2:
//		int primeiroNumero = 33;
//		int segundoNumero = 66;
//		int divisao = primeiroNumero / segundoNumero;
//		System.out.println("Resultado: " + divisao);
//		
		
//		Exemplo 3:
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		int primeiroNumero = input.nextInt();
		System.out.print("Digite o segundo número: ");
		int segundoNumero = input.nextInt();
		int divisao = primeiroNumero / segundoNumero;
		System.out.println("Divisão: " + divisao);
	}
}