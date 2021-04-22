package basicLevel.Exercice.ExerciseOne;

import java.util.Scanner;

public class hello {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
//		Exemplo 1:		
		System.out.println("Insira o seu primeiro nome: ");
		String nome = input.nextLine();
		
		System.out.println("Olá, \n" + nome);
		
//		Exemplo 2:
//		System.out.println("Olá \nRafaella Lopes");
	}

}
