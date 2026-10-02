package boletim;

import java.util.Scanner;

public class Boletim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Nome do Aluno 
        String nomeAluno;

        System.out.println("Digite o nome do Aluno");
        nomeAluno = sc.nextLine();

        //Nota 1
        double nota1;
        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        //Nota 2
        double nota2;
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        //Nota 3
        double nota3;
        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextDouble();

        //Média
        double media;
        media = (nota1 + nota2 + nota3) / 3;
        

       

         //Boletim
         System.out.println("Aluno: " + nomeAluno);
         System.out.println("Nota 1: " + nota1);
         System.out.println("Nota 2: " + nota2);
         System.out.println("Nota 3: " + nota3);
         System.out.printf("Media: " + media);       
         if (media >= 7) {
            System.out.println("Situação: Aprovado");
        }else if(media >= 5){
            System.out.println("Situação: Recuperação");
        } else{
            System.out.println("Situação: Reprovado");
        }
    }
}
