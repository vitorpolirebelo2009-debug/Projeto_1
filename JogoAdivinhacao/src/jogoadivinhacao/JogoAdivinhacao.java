package jogoadivinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random sorteador = new Random();

        //Variavel que controla o loop do jogo
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            //Escolha de dificuldade
            System.out.println(" Escolha a Dificuldade");
            System.out.println("1- Facil   (1 a 50,  10 tentativas)");
            System.out.println("2- Medio   (1 a 100,  7 tentativas)");
            System.out.println("3- Dificil (1 a 200,  5 tentativas)");
            int dificuldade = sc.nextInt();

            //Variaveis que irão receber valores de cada nível
            int limiteSuperior;
            int limiteInferior = 0;
            int maxTentativas;
            int pontuacaoMaxima; // pontos ganhos se acertar de primeira
            int pontosPorTentativas; // quanto desconta a cada erro

            if (dificuldade == 1) {
                limiteSuperior = 50;
                maxTentativas = 10;
                pontuacaoMaxima = 100;
                pontosPorTentativas = 10;
            } else if (dificuldade == 2) {
                limiteSuperior = 100;
                maxTentativas = 7;
                pontuacaoMaxima = 2000;
                pontosPorTentativas = 25;
            } else if (dificuldade == 3) {
                limiteSuperior = 200;
                maxTentativas = 5;
                pontuacaoMaxima = 5000;
                pontosPorTentativas = 50;
            } else {
                System.out.println("Opcao invalida, definido para dificuldade média");
                limiteSuperior = 100;
                maxTentativas = 7;
                pontuacaoMaxima = 2000;
                pontosPorTentativas = 35;
            }
            //Sorteio dos números
            //nextInt(n) gera um número de 0 até (n-1), por isso somamos
            // o limiteInferior e ajustamos o intervalo com a subtração.
            // Exemplo: intervalo 1 a 50 -> sorteador.nextInt(50) + 1
            int numeroSecreto = sorteador.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;

            System.out.println("\nNúmero  secreto sorteado entre " + limiteInferior
                    + " e " + limiteSuperior + ", Voce tem " + maxTentativas + " tentativas");
            //Sistema de tentativas
            //Esse loop tem DUAS condições de parada:
            //   o jogador acerta (usamos uma variável "acertou")
            //   o número de tentativas usadas atinge o máximo
            // Por isso usamos essas duas variáveis de controle no while.

            int tentativasUsadas = 0;
            boolean acertou = false;
            while (tentativasUsadas < maxTentativas && !acertou) {

                System.out.println("\nTentativas " + (tentativasUsadas + 1) + " de " + maxTentativas + "Digite seu palpite: ");

                int palpite = sc.nextInt();

                tentativasUsadas++;

                if (palpite == numeroSecreto) {
                    acertou = true;
                } else if (palpite < numeroSecreto) {
                    System.out.println(palpite + "é menor que o numero secreto.");
                } else {
                    System.out.println("O numero secreto e MENOR que " + palpite + ".");
                }
            }
                //Pontuação 
                // Só existe pontuação se o jogador acertou.
                // Fórmula: pontuacaoMaxima - (erros * pontosPorTentativa)
                // "erros" é o número de tentativas usadas ANTES de acertar,
                // ou seja, tentativasUsadas - 1 (a última tentativa foi o acerto).
                // Usamos Math.max para garantir que a pontuação nunca fique negativa.
                if (acertou) {
                    int erros = tentativasUsadas - 1;
                    int pontuacaoFinal = Math.max(0, pontuacaoMaxima - (erros * pontosPorTentativas));

                    System.out.println("\nParabens! Voce acertou o numero " + numeroSecreto + " em " + tentativasUsadas + "tentativa(s).");
                    
                    System.out.println("Pontuacao da  rodada: " + pontuacaoFinal + "pontos.");
                } else{
                    //Esgotou as tentativas sem acertar -> pontuação da rodada é zero 
                    System.out.println("\nSuas tentativas acabaram! O numero era: " + numeroSecreto);
                    System.out.println("Pontuação da rodada: 0 pontos");
                }
                //Pergunta se quer jogar de novo
                System.out.println("\nDeseja jogar novamente(1- Sim/ 2- Nao): ");
                int resposta = sc.nextInt();
                jogarNovamente = (resposta == 1);
            }
             System.out.println("\nObrigado por jogar");
            sc.close();
        }
           
    }

