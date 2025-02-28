package Condicionamento;

import java.util.Scanner;

public class condicionamento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 4) {


            System.out.print("Escolha o nível de condicionamento:\n" +
                    "1. Iniciante\n" +
                    "2. Intermediário\n" +
                    "3. Avançado\n" +
                    "4. Sair\n" +
                    "\n" +
                    "Opção:");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Plano para Iniciante");
                    break;
                case 2:
                    System.out.println("Plano para Intermediário");
                    break;
                case 3:
                    System.out.println("Plano para Avançado");
                    break;
                case 4:
                    System.out.println("Bye");
                    break;

                default:
                    System.out.println("Opção Inválida");

            }
        }

        do {
            System.out.println("Estou em execução");
        } while (false);
    }


}












