package exercício3.menu.de.operações.matemáticas;

 import java.util.Scanner;
public class Exercício3MenuDeOperaçõesMatemáticas {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int opcao;
       double num1, num2, resultado;

        // menu repete até sair
        do{
            //menu
            System.out.println("\n*** Menu de operações ***");
            System.out.println("1- Somar");
            System.out.println("2- Subtrair");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("5- Sair");
            System.out.println("escolha uma opção: ");
            opcao = sc.nextInt();
        
            //Swicht para escolher a operação
            switch (opcao) {
                case 1:
                    System.out.println("Digite o primeiro numero: ");
                     num1 = sc.nextDouble();
                    System.out.println("Digite o segundo numero: ");
                    num2 = sc.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                    break;
                    
                case 2:
                  System.out.println("Digite o primeiro numero: ");
                     num1 = sc.nextDouble();
                    System.out.println("Digite o segundo numero: ");
                    num2 = sc.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                    break;
                    
                case 3:
                    System.out.println("Digite o primeiro numero: ");
                     num1 = sc.nextDouble();
                    System.out.println("Digite o segundo numero: ");
                    num2 = sc.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + num1 + " x " + num2 + " = " + resultado);
                    break;
                    
                case 4: 
                    System.out.println("Digite o primeiro numero: ");
                     num1 = sc.nextDouble();
                    System.out.println("Digite o segundo numero: ");
                    num2 = sc.nextDouble();
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + num1 + " / " + num2 + " = " + resultado);
                    break;
                    
                case 5:
                    System.out.println("Saindo ");
         
                    break;
                    
                    default:
                        System.out.println("Opcao invalida");
                        
                         //Pausa antes do próximo menu
            
                           if (opcao != 5) {
                            System.out.println("\nPressione Enter para continuar");
                            sc.nextLine();//limpa buffer
                            sc.nextLine();//espera enter
                            
                        }
                        
            }
            
        }
    while (opcao != 5);//repete até escolher 5
            System.out.println("Programa finalizado");
            sc.close();
        
        }

}
