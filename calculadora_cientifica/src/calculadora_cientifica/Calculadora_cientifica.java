package calculadora_cientifica;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora_cientifica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variaveis
        int opcao, opcao2, numero1, numero2;//Operações Básicas
        double base, expoente;  //Potência
        double radicando, raizQuadrada, raizCubica, raizN, indice; //Raiz
        double numero;
        int porcentagem; //Porcentagem
        double resultado;
        //Historico para guardar as contas já feitas
        ArrayList<String> historico = new ArrayList<>();
        //Varialvel para controlar o loop
        boolean continuar = true;
       while (continuar) {
        //Pede para escolher a operação que o usuário quer fazer
        System.out.println("Escolha a operacao: ");
        System.out.println("1- Soma");
        System.out.println("2- Subtracao");
        System.out.println("3- Multiplicacao");
        System.out.println("4- Divisao");
        System.out.println("5- Potência");
        System.out.println("6- Raiz");
        System.out.println("7- Porcentagem");
        System.out.println("8- Historico"); 
        System.out.println("9- Sair");
        opcao = sc.nextInt();
        
            //Fazer o cálculo que o usuário escolheu
            //1- Soma
            if (opcao == 1) {
                System.out.println("Digite o primeiro numero: ");
                numero1 = sc.nextInt();
                System.out.println("Digite o segundo numero: ");
                numero2 = sc.nextInt();
                resultado = numero1 + numero2;
                historico.add(numero1 + " + " + numero2 + " = " + resultado);
                System.out.println(resultado);
            } //2- Subtração
            else if (opcao == 2) {
                System.out.println("Digite o primeiro numero: ");
                numero1 = sc.nextInt();
                System.out.println("Digite o segundo numero: ");
                numero2 = sc.nextInt();
                resultado = numero1 - numero2;
                historico.add(numero1 + " - " + numero2 + " = " + resultado);
                System.out.println(resultado);
            } //3- Multiplicação
            else if (opcao == 3) {
                System.out.println("Digite o primeiro numero: ");
                numero1 = sc.nextInt();
                System.out.println("Digite o segundo numero: ");
                numero2 = sc.nextInt();
                resultado = numero1 * numero2;
                historico.add(numero1 + " x " + numero2 + " = " + resultado);
                System.out.println(resultado);
            } //Divisão
            else if (opcao == 4) {
                System.out.println("Digite o primeiro numero: ");
                numero1 = sc.nextInt();
                System.out.println("Digite o segundo numero: ");
                numero2 = sc.nextInt();
                if(numero2 != 0){
                resultado = numero1 / numero2;
                historico.add(numero1 + " / " + numero2 + " = " + resultado); 
                System.out.println(resultado);
                }else{
                    System.out.println("ERRO: Impossivel dividir por zero");        
                }
            }
            //Potência
            else if (opcao == 5) {
                System.out.println("Digite a Base: ");
                base = sc.nextDouble();
                System.out.println("Digite o expoente: ");
                expoente = sc.nextDouble();
                resultado = Math.pow(base, expoente);
                System.out.println(resultado);
                historico.add( base + " ^ " + expoente + " = " + resultado); 
            } //Raiz 
            else if (opcao == 6) {
                //Pede pra escolher entre raiz quadrada, cúbica ou qualquer outra raiz
                System.out.println("1- Raiz Quadrada");
                System.out.println("2- Raiz Cubica");
                System.out.println("3- Raiz de N");//Raiz de 4, 5, 6...
                System.out.println("Que tipo de raiz voce quer usar: ");
                opcao2 = sc.nextInt();
                //Raiz Quadrada
                if (opcao2 == 1) {
                    System.out.println("Digite o radicando: ");
                    radicando = sc.nextDouble();
                    raizQuadrada = Math.sqrt(radicando);
                    System.out.println(raizQuadrada);
                    historico.add(" √ " + radicando + " = " + raizQuadrada); 
                } else if (opcao2 == 2) {
                    //Raiz Cúbica
                    System.out.println("Digite o radicando: ");
                    radicando = sc.nextDouble();
                    raizCubica = Math.cbrt(radicando);
                    System.out.println(raizCubica);
                    historico.add(" ³√ " + radicando + " = " + raizCubica); 
                } //Raiz de N
                else if (opcao2 == 3) {
                    System.out.println("Digite o radicando: ");
                    radicando = sc.nextDouble();
                    System.out.println("Digite o indice");
                    indice = sc.nextDouble();
                    raizN = Math.pow(radicando, (1.0 / indice));
                    System.out.println(raizN);
                    historico.add(" *√ " + radicando + " = " + raizN);//* = Qualquer raiz além da quadrada e da cúbica 
                }
            } //Porcentagem
            else if (opcao == 7) {
                System.out.println("Digite o numero: ");
                numero = sc.nextDouble();
                System.out.println("Digite a porcentagem: ");
                porcentagem = sc.nextInt();
                resultado = (numero * porcentagem) / 100;
                System.out.println(resultado);
                historico.add(porcentagem + "% de " + numero + " = " + resultado);
            }
            //Historico
            else if(opcao == 8){
                if(historico.isEmpty()){
                    System.out.println("Nenhum calculo foi salvo");
                }else{
                    System.out.print("\n--- Historico de calculos ---");
                    for(String item : historico){
                        System.out.println(item);
                    }
                }
            }
            //Sair
            else if(opcao == 9){
                System.out.println("Fechando calculadora...");
                continuar = false;
            }
            //Se digitar nehuma das opções
            else{
                System.out.println("Opcao invalida");
            }

          
        }
  sc.close();
    }
}
