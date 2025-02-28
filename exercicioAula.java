package ExercicioAula;

import java.util.Scanner;

public class ExercicioAula {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //EXERCICIO 01

        System.out.print("Digite um Número Inteiro:");
        int numero = scan.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Número PAR!");
        } else {
            System.out.println("Número ÍMPAR!");
        }

        System.out.println(numero % 2 == 0 ? "Número PAR!" : "Número ÍMPAR!");
    }

}