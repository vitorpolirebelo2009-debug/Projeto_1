package sistema_caixa_de_banco;

import java.util.Scanner;

public class Sistema_Caixa_de_Banco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        double saldo = 1000;
     while (opcao != 4) {
        System.out.println("Escolha uma opcao: ");
        System.out.println("1- Consultar saldo");
        System.out.println("2- Depositar");
        System.out.println("3- Sacar");
        System.out.println("4- sair");
        opcao = sc.nextInt();
        //Loop até selecionar 4
        
            //Opção 1
            if (opcao == 1) {
                System.out.println("Seu saldo e de R$" + saldo);
            }
            //Opção 2
            if (opcao == 2) {
                System.out.println("Digite o valor do deposito: ");
                double valorDoDeposito = sc.nextDouble();

                if (valorDoDeposito > 0) {
                    System.out.println("Depósito realizado");
                    saldo = saldo + valorDoDeposito;
                    System.out.println("Valor do Deposito: " + saldo);
                    System.out.println("Novo saldo: " + saldo);
                } else {
                    System.out.println("Depósito Invalido");
                    System.out.println("Saldo: " + saldo);
                }

            }
            //Opção 3
            if (opcao == 3) {
                System.out.println("Digite o valor do saque: ");
                double valorDoSaque = sc.nextDouble();

                if ( valorDoSaque > 0 && valorDoSaque <= saldo) {
                    saldo = saldo - valorDoSaque;
                    System.out.println("Saque efetuado: " + saldo);
                } else {
                    System.out.println("Saldo insuficiente");
                }
            }

        }
        System.out.println("Obrigado por usar o caixa eletronico");

    }
}
