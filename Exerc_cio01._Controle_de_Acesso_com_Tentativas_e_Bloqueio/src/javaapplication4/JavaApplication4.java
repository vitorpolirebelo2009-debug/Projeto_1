package javaapplication4;


 import java.util.Scanner;
public class JavaApplication4 {

   
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String descUsuario = "admin";
    String descSenha = "1234";
    String usuarioInformado, senhaInformada;
    int tentativasRestantes = 3;
    boolean acessoLiberado = false;
    
    //loop principal
    while (tentativasRestantes > 0 && !acessoLiberado) {
    //limpa tela 
        System.out.println("\033[H\033[2J");
        System.out.flush();
        
        System.out.println("*** Senha de Acesso ***");
        System.out.println("Tentativas Restantes" + tentativasRestantes);
        System.out.println("*******************");
        
        System.out.println("Usuario: ");
        usuarioInformado = sc.nextLine();
        
        System.out.println("Senha: ");
        senhaInformada = sc.nextLine(); 
        
        //senha correta
        
         if (usuarioInformado.equalsIgnoreCase(descUsuario) && 
                senhaInformada.equalsIgnoreCase(descSenha)) {
            
             System.out.println("\nAcesso Liberado!");
             acessoLiberado = true;
             break;
    }else{
             //senha errada
            tentativasRestantes--;
            
            if(tentativasRestantes > 0){
                System.out.println("\n Usuario ou senha incorretos");
                
                System.out.println("Tente novamente");
                try{
                    Thread.sleep(2000);
                    } catch(InterruptedException e){
                        
                    } 
            }else{
                            System.out.println("\nUsuario Bloqueado");
                            
                            }
                
            }
         }
        sc.close();
        
    }
 
    }


