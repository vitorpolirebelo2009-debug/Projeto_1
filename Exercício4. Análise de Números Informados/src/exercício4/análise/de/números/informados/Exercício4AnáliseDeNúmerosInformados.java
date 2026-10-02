package exercício4.análise.de.números.informados;


 import java.util.Scanner;
public class Exercício4AnáliseDeNúmerosInformados {

   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        
      int numero;
      int quantidade = 0;
      int positivos = 0;
      int negativos = 0;
      int pares = 0;
      int impares = 0;
      
        System.out.println("*** Análise de numeros ***");
        System.out.println("Digite os numeros: ");
        numero = sc.nextInt();
        
        //loop até digitar -1
        while (numero != -1) {
                quantidade++;//conta todos
            
                //multiplas condições dentro do loop
             if (numero > 0) {
                positivos++;
             }
            if (numero < 0){
                negativos++;
            }
            if (numero % 2 == 0){
                pares++;
            }
            if (numero % 2 != 0){
                impares++;
            } 
           
           //Próximo número
            System.out.println("Numero: ");
            numero = sc.nextInt();
        }
        System.out.println("*** Resultado ***");
        System.out.println("Quantidade" + quantidade);
        System.out.println("Positivos" + positivos);
        System.out.println("Negativos" + negativos);
        System.out.println("Pares" + pares);
        System.out.println("Impares" + impares);
        
        sc.close();
    }

}
