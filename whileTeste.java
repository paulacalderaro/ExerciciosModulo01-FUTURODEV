package While;

import java.util.Scanner;

public class whileTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nomes = new String[5];

        int contador = 0;

        while (contador < 5) {
            System.out.println("Estou em execução");

            contador++;

            if (contador == 4)
                break;

            int i;
            for (i = 0; i < 3; i++) ;
            System.out.println(++i);
            System.out.println(i++);

            double[] notas = {6.5, 7.8, 9, 3};
            boolean[] valores_logicos = {true, false, false};


        }
    }
}

