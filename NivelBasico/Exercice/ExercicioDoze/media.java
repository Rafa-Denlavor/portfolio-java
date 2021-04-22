package basicLevel.Exercice.ExerciceTwelve;

import java.util.Scanner;

public class media {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
//      Exemplo 1:
        System.out.println("Para calcular a média, insira o primeiro número: ");
        int primeiroNumero = input.nextInt();

        System.out.println("Segundo número: ");
        int segundoNumero = input.nextInt();

        System.out.println("Terceiro número: ");
        int terceiroNumero = input.nextInt();

        int media = (primeiroNumero + segundoNumero + terceiroNumero) / 2;

        System.out.println("A média é : " + media);

//      Exemplo 2:
//      System.out.println("Para calcular a média, insira o primeiro número: ");
//      int primeiroNumero = input.nextInt();
//
//      System.out.println("Segundo número: ");
//      int segundoNumero = input.nextInt();
//
//      System.out.println("Terceiro número: ");
//      int terceiroNumero = input.nextInt();
//
//      System.out.println("A média é : " + ((primeiroNumero + segundoNumero + terceiroNumero) / 2));
    }
}
