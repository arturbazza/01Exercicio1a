package br.org.fundatec.exercicio1a.br.org.forca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] palavras = {"ABACATE", "BANANA", "MELANCIA", "MORANGO"};
        JogoForca jogo = new JogoForca(palavras);
        Scanner scanner = new Scanner(System.in);

        System.out.println(jogo.iniciarJogo());

        while (jogo.tentativasRestantes > 0 && !jogo.palavra.palavraDescoberta()) {
            char letra = scanner.nextLine().charAt(0);
            System.out.println(jogo.tentativa(letra));
        }
    }
}
