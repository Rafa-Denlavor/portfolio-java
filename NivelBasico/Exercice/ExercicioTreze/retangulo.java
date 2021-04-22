package basicLevel.Exercice.ExerciceThirteen;

import java.util.Scanner;

public class retangulo {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
//		Exemplo 1:
		System.out.print("Altura: ");
		double altura = input.nextDouble();
		
		System.out.print("Largura: ");
		double largura = input.nextDouble();
		
		double perimetro = 2 * (largura + altura);
		double area = largura * altura;
		
		System.out.println("Perímetro: " + perimetro);
		System.out.println("Área: " + area);
		
//		Exemplo 2:
//		System.out.print("Altura: ");
//		double altura = input.nextDouble();
//		
//		System.out.print("Largura: ");
//		double largura = input.nextDouble();
//		
//		System.out.println("Perímetro: " + (2 * (largura + altura)));
//		System.out.println("Área: " + (largura * altura));
	}

}