package ExercicioAulaTres;

import java.util.Scanner;

public class exercicioAulaTres {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salario mensal:");
        double salario = scan.nextDouble();

        System.out.println("Digite o tempo de serviço em anos:");
      int tempo_de_servico = scan.nextInt();

      double bonus;
      if (tempo_de_servico >= 5) {
          bonus = salario * 0.10;
                System.out.println("Bônus salarial de 10%");

      } else {
          bonus = salario * 0.05;
        System.out.println("Bônus salarial de 5%");
      }
        double novoSalario = salario + bonus;

          System.out.println("\nSalário Original: R$" + salario);
          System.out.println("Bônus calculado: R$" + bonus);
          System.out.println("Novo salário após bônus: R$" + novoSalario);

          scan.close();

      }
    }
