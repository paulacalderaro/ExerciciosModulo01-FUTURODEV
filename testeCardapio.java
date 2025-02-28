package TesteCardapio;

import java.util.Scanner;

public class testeCardapio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a opção de sua escolha:");
        int valor = scan.nextInt();
        switch (valor) {
            case 1:
                System.out.println("Produto sem Lactose");
                break;
            case 2:
                System.out.println("Produto sem Glúten");
                break;
            case 3:
                System.out.println("Produto sem Farinha");
                break;
            case 4:
                System.out.println("Produto Vencido");
                break;
            default:
                System.out.println("Opção Inválida");
                scan.close();
        }

    }
}
