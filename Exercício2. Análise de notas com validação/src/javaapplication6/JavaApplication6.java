package javaapplication6;


 import java.util.Scanner;
public class JavaApplication6 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("***Notas do Aluno***\n");
        
        //variaveis
        double nota1, nota2, nota3, media;
        
        //Nota 1 com validação while
        System.out.println("Digite a primeira nota (0-10): ");
        nota1 = sc.nextDouble();
        while(nota1 < 0 || nota1 > 10 ) {
            System.out.println("Nota invalida, digite novamente (0-10): ");
            nota1 = sc.nextDouble();
        }
        //Nota 2
        System.out.println("Digite a segunda nota (0-10): ");
        nota2 = sc.nextDouble();
        while (nota2 < 0 || nota2 > 10) {
            System.out.println("Nota invalida, digite novamente (0-10): ");
            nota2 = sc.nextDouble();
        }
       //Nota 3
        System.out.println("Digite a terceira nota (0-10): ");
        nota3 = sc.nextDouble();
        while (nota3 < 0 || nota3 > 10) {
            System.out.println("Nota invalida, digite novamente (0-10): ");
            nota3 = sc.nextDouble();
        }
    //calcule media
    media = (nota1 + nota2 + nota3) / 3;
    
    //exibe resultado
        System.out.println("\n*** Resultado ***");
        System.out.println("Notas: " + nota1 + "," + nota2 + "," + nota3);
        System.out.println("Media" + media);
        
        //Validação(Aprovado, recuperação, reprovado)
        if (media >= 7) {
            System.out.println("Aprovado");
        }else if (media >= 5 && media < 7){
            System.out.println("Recuperacao");
        }else {
            System.out.println("Reprovado");
        }
sc.close();
    }
}
