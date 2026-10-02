
package sistem_de_estoque;

import java.util.Scanner;


public class Sistem_de_estoque {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeProduto;
        int qtdeProduto = 0;
        double precoProduto;
        double valorProduto;
        double totalEstoque = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o nome do produto: ");
            nomeProduto = sc.nextLine();
            System.out.println("Digite a quantidade desse produto: ");
           qtdeProduto = sc.nextInt();
             while(qtdeProduto <= 0){
                 System.out.println("Quantidade inválida, digite novamente.");
                 qtdeProduto = sc.nextInt();
            }
            sc.nextLine();
            System.out.println("Digite o preco do produto: ");
            precoProduto = sc.nextDouble();
             while(precoProduto <= 0){
                 System.out.println("Preco inválido, digite novamente.");
                 precoProduto = sc.nextDouble();
            }
             sc.nextLine();
            valorProduto = precoProduto * qtdeProduto;
            System.out.println("O valor do produto e: " + valorProduto);

            System.out.println("Produto: " + nomeProduto);
            System.out.println("Quantidade: " + qtdeProduto);
            System.out.println("Preco: " + precoProduto);
             totalEstoque = totalEstoque + valorProduto;
        }
        System.out.println("O valor total é: " + totalEstoque);
        
    }
    
}
