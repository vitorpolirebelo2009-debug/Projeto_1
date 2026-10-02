package exercício7.simulação.de.fluxo.de.caixa.diário;


import java.util.ArrayList;
import java.util.Scanner;
public class Exercício7SimulaçãoDeFluxoDeCaixaDiário {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    // variaveis
    double saldo = 0.0;
    int opcao = 0;     
    
        ArrayList<String>historico = new ArrayList<>();
          
    
    
        System.out.println("***Simulcao de caixa de fluxo***");
        System.out.println("Saldo inicial: R$ " + String.format("%.2f", saldo));
        
        //loop continua até digitar 4
        while (true) {
            System.out.println("\n*** Saldo Atual: R$" + String.format("%.2f", saldo));
            System.out.println("1- Entrada");
            System.out.println("2- Saida");
            System.out.println("3-Consulta de saldo");
            System.out.println("4-Encerrar");
            
            opcao = sc.nextInt();
            
            if(opcao == 1) {
                System.out.println("DIGITE O VALOR DA ENTRADA");
                double vlrEntrada = sc.nextDouble();
                if(vlrEntrada > 0){
                    saldo += vlrEntrada;
                    System.out.println("***Entrada registrada, novo saldo: R$" + String.format("%.2f", saldo) + "***");
                   historico.add("+ R$" + vlrEntrada);
         
                }else{
                    System.out.println("Valor invalido");
                }
            }else if(opcao == 2){
                System.out.println("DIGITE O VALOR DA SAIDA");
                double vlrSaida = sc.nextDouble();
                historico.add("- R$" + vlrSaida);
                   
                //validação: não permitir saldo negativo
                if(vlrSaida > saldo){
                    System.out.println("Saldo insuficiente");
                }else if(vlrSaida > 0){
                    saldo -= vlrSaida;
                    System.out.println("Saida registrada, novo saldo: R$" + String.format("%.2f", saldo));
                }else{
                    System.out.println("Valor inválido");
                }
            }else if (opcao == 3){
                System.out.println("Seu saldo atual é de: R$" + String.format("%.2f", saldo));
                System.out.println("Historico: ");
                for(String mov : historico){
                    System.out.println("  " + mov);
                }
            }else if(opcao == 4){
                //validação crítica: só encerra se saldo >= 0
                if(saldo >= 0){
                    System.out.println("Sistema encerrado, saldo final: R$" + String.format("%.2f", saldo));
                    System.out.println("Ate a proxima");
                    break;
                }else{
                    System.out.println("ERROR: Não é possível encerrar com saldo negativo");
                }
            
            }else{
                System.out.println("Opcao invalida, ecolha entre 1, 2, 3, 4.");
            }
        }
    sc.close();
    }
}