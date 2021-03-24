package nivelBasico.Exercicios.OneExercise;

import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		
//		Exemplo 1:
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o seu primeiro nome: ");
		String nome = input.nextLine();
		
		System.out.println("Olá, \n" + nome);
		
//		Exemplo 2:
//		System.out.println("Olá \nRafaella Lopes");
	}

}
