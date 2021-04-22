package basicLevel.Exercice.ExerciceEleven;

import java.util.Scanner;

public class perimetroArea {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
//		Exemplo 1:
		System.out.println("Insira o raio: ");
		double raio = input.nextDouble();
		
		System.out.println("Perímetro do raio: " + (2 * 3.14 * raio));
		System.out.println("Área do raio: " + (3.14 * raio * raio));
		
//		Exemplo 2:
//		System.out.println("Insira o raio: ");
//		double raio = input.nextDouble();
//		
//		double perimetro = 2 * 3.14 * raio;
//		double area = 3.14 * raio * raio;
//		
//		System.out.println("Perímetro do raio: " + perimetro)
//		System.out.println("Área do raio: " + area);
	} 
}
