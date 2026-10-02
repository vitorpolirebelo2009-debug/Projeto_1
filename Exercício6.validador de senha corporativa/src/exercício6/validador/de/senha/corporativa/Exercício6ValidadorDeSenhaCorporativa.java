
package exercício6.validador.de.senha.corporativa;


 import java.util.Scanner;
public class Exercício6ValidadorDeSenhaCorporativa {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String senha;
       
        System.out.println("*** Validador de senha corporativa ***");
        System.out.println("Critérios: ");
        System.out.println("- Mínimo 8 caracteres");
        System.out.println("- 1 letra Maiúscula");
        System.out.println("- 1 letra minúscula");
        System.out.println("- 1 numero");
        System.out.println("- 1 caractere especial(!@#$$%&)");
        
        //loop até a senha válida
        while (true) {
            System.out.println("\nDigite a senha: ");
            senha = sc.nextLine();
            //Validação das variaveis
             boolean temMaiuscula = false;
             boolean temMinuscula = false;
             boolean temNumero = false;
             boolean temEspecial = false;
             //1. verifica tamanho
             if (senha.length() < 8) {
                 System.out.println("Erro: Mínimo 8 caracteres.");
                 continue;
             }
            //2.Percorre string  com for e if
            for (int i = 0; i < senha.length(); i++) {
                char c = senha.charAt(i);
                //if para letra maiuscula
                if (c >= 'A' && c <= 'Z') {
                }//if pata letra minuscula
                if(c >= 'a' && c <= 'z') {
                }//if para numero
                if (c >= '0' && c <= '9'){
                }//if para especial
                if(c == '!' || c == '@' || c == '#' || c == '$' || 
                       c == '%' || c == '&' || c == '*') {
                    }
                 }
            //3.Lógica Encadeada - verifica todos critérios
            if (!temMaiuscula) {
                System.out.println("ERRO: Precisa 1 letra Maiuscula");
                continue;
            }
            if (!temMinuscula) {
                System.out.println("ERRO: Precisa 1 letra Minuscula");
                continue;
            }
            if (!temNumero) {
                System.out.println("ERRO: Precisa 1 Numero");
                continue;
            }
        if (!temEspecial) {
                System.out.println("ERRO: Precisa 1 Caractere especial");
                continue;
            }
        //senha válida
            System.out.println("\n Senha válida, acesso liberado");
            break;
        }
        
        sc.close();
    }

}
