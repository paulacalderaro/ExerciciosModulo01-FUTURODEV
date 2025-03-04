package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "ºnumero: ");
            int numero = scan.nextInt();
            numeros.add(numero);
        }

        for (int numero : numeros) {
            if (numero == 10 || numero == 100 || numero == 1000) {
                System.out.println("Você ganhou um bônus de $50,00! ");
            }

        }

    }
}
