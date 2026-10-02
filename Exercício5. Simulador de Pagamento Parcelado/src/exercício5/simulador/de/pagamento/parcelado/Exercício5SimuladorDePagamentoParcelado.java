package exercício5.simulador.de.pagamento.parcelado;


 import java.util.Scanner;
public class Exercício5SimuladorDePagamentoParcelado {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variaveis
        double vlrProduto, vlrFinal, vlrParcela;
        int formaPagamento; 
         //digitar o valor do produto
        System.out.println("Digite o valor do produto");
        vlrProduto = sc.nextDouble();
        //forma de pagamento
        System.out.println("*** FORMA DE PAGAMENTO ***");
        System.out.println("1- A vista (10% de desconto)");
        System.out.println("2- 2x (sem juros)");
        System.out.println("3- 3x (10% de juros)");
        System.out.println("4- 5x (20% de juros)");
        System.out.println("Escolha a forma de pagamento: ");
        formaPagamento = sc.nextInt();
        
        //case para escolha
        switch (formaPagamento) {
            case 1:// À vista - 10% desconto
                vlrFinal = vlrProduto * 0.90;
                System.out.printf("A vista\n");
                System.out.printf("Valor Final: R$ %.2f\n", vlrFinal);
                 break;
            case 2: //2x sem juros
                vlrFinal = vlrProduto;
                vlrParcela = vlrProduto / 2;
                System.out.printf("2x sem juros\n");
                System.out.printf("Valor final: %.2f\n", vlrFinal);
                System.out.printf("2 parcelas de: R$ %.2f\n", vlrParcela);
                break;
            case 3://3x + 10% de juros
                vlrFinal = vlrProduto * 1.10;
                vlrParcela = vlrFinal / 3;
                System.out.println("3x com juros");
                System.out.printf("Valor final: R$ %.2f\n", vlrFinal);
                System.out.printf("3 parcelas de: R$ %.2f\n", vlrParcela);
                break;
            case 4://5x + 20% de juros
                vlrFinal = vlrProduto * 1.20;
                vlrParcela = vlrFinal / 5;
                System.out.println("5x com juros");
                System.out.printf("Valor Final: R$ %.2f\n", vlrFinal);
                System.out.printf("5 parcelas de: R$ %.2f\n", vlrParcela);
                break;
               default:
                   System.out.println("Opcao inválida");
                   System.out.println("Escolha 1, 2, 3 ou 4.");
                   sc.close();
                   return;
                   
        }
        System.out.println("\n pagamento processo");
        sc.close();
        
    }

}
