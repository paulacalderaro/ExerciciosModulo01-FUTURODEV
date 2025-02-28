package semana02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Comentário
        para
        várias
        linhas
              */
        // Comentário em linha

        //DECLARAÇÃO PARA VARIÁVEIS E CONSTANTES

        byte number1 = 1; // declarando a variavel e atribuindo valor a ela.
        // neste exemplo é quando já sabemos o valor da variavel, então já pode fazer direto.

        byte number2; // declarando a variavel
        number2 = 2; // atribuindo valor a variavel
        // neste exemplo é quando fazemos a variável mas só depois vamos descobrir o valor dela.

        short number3 = 3;
        int number4 = 4;
        long number5 = 499999; //a diferença de cada um é a capacidade de armazenamento

        double decimal1 = 3.14;
        float decimal2 = 1.0F;

        char sexo = 'M';

        boolean isActive = false;

        final double PI = 3.14;

        //OPERADORES

        int idade = 15;
        boolean habilitado = false;

        System.out.println(idade > 18); //false
        System.out.println(idade < 18); //true

        System.out.println(habilitado == true); //false

        System.out.println(idade > 18 && habilitado == true); //false


        //CASTING
        double testNumber1 = 10; //Inteiro para double

        int testnumber1 = (int) 10.0; //double para inteiro

    /*
    ENTRADA DE DADOS - PROCESSAMENTO - SAÍDA DE DADOS
     */
        Scanner scan = new Scanner(System.in);
/*
        //String
        scan.next(); //lê tudo que digito até o espaço
        scan.nextLine(); //lê tudo que digito até o enter
        //Inteiros
        scan.nextInt();
        //Decimais
        scan.nextDouble();
        scan.nextFloat();
        //Lógicos
    scan.nextBoolean();
 */

        System.out.print("CADASTRO DE USUARIO\nNome Completo:");
        String nomeCompleto = scan.nextLine();
        System.out.println("Idade:");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.print("Endereço:");
        String endereco = scan.nextLine();

        System.out.println("RELATÓRIO DO USUÁRIO");
       System.out.printf("Nome Completo: %s\nIdade: %d\n%s", nomeCompleto , age, endereco);

        //%i %d : Inteiros
        //%s : String
        //%f : Decimais
        //%c: Caractere Único

        if(age >= 18){
            System.out.println("Usuário maior de idade");

        }else {
            System.out.println("Usuário menor de idade");
        }


boolean conexaoBanco = false;

            if (!conexaoBanco){
                System.out.println("Falha ao conectar com o banco de dados!");

        }


    }
}