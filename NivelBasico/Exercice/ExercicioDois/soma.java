package basicLevel.Exercice.ExerciseTwo;

import java.util.Scanner;

public class soma {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
//		Exemplo 1:
		System.out.print("Digite o primeiro número: ");
		int primeiroNumero = input.nextInt();
		System.out.print("Digite o segundo número: ");
		int segundoNumero = input.nextInt();
		int soma = primeiroNumero + segundoNumero;
		System.out.println("Soma: " + soma);
		
//		Exemplo 2:
//		System.out.println(67 + 33);
		
//		Exemplo 3:
//		int primeiroNumero = 33;
//		int segundoNumero = 66;
//		int soma = primeiroNumero + segundoNumero;

//		System.out.println("Resultado: " + soma);

	}

}
