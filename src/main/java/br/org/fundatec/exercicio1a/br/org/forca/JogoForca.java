package br.org.fundatec.exercicio1a.br.org.forca;

import java.util.Random;

public class JogoForca {
    public Palavra palavra;
    public int tentativasRestantes;
    private StringBuilder letrasDigitadas;
    private int acertos;
    private int erros;

    public JogoForca(String[] palavras) {
        Random random = new Random();
        this.palavra = new Palavra(palavras[random.nextInt(palavras.length)]);
        this.tentativasRestantes = 10;
        this.letrasDigitadas = new StringBuilder();
        this.acertos = 0;
        this.erros = 0;
    }

    public String iniciarJogo() {
        return  "|------------------------------------------------------------------|\n" +
                "|                         JOGO DA FORCA                            |\n" +
                "|------------------------------------------------------------------|\n" +
                "|A palavra contem " + palavra.getPalavra().length() + " letras " +"                                       |\n" +
                "|e voce tem 10 chances para acertar a palavra.                     |\n" +
                "|Palavra: " + palavra.getPalavraAtual() + ".                             |\n" +
                "|Tentativa 1 de 10 (0 acertos, 0 erros).                           |\n" +
                "|------------------------------------------------------------------|\n" +
                "Digite uma letra:";
    }

    public String tentativa(char letra) {
        if (tentativasRestantes <= 0 || palavra.palavraDescoberta()) {
            return "Jogo finalizado!";
        }

        letra = Character.toUpperCase(letra);
        if (letrasDigitadas.indexOf(String.valueOf(letra)) != -1) {
            return "Letra ja digitada! Tente outra letra.";
        }

        letrasDigitadas.append(letra).append(", ");
        tentativasRestantes--;

        boolean acertou = palavra.tentativa(letra);
        if (acertou) {
            acertos++;
        } else {
            erros++;
        }

        String mensagem = acertou ? "Acertou!" : "Errou!";
        mensagem += " " + palavra.getPalavraAtual() + "\n" +
                "Tentativa " + (10 - tentativasRestantes) + " de 10 (" +
                acertos + " acertos, " +
                erros + " erros, letras digitadas: " + letrasDigitadas.toString().trim() + ")\n" +
                "Digite uma letra:";

        if (palavra.palavraDescoberta()) {
            mensagem = "Parabens, voce acertou! A palavra era '" + palavra.getPalavra() + "'.";
        } else if (tentativasRestantes <= 0) {
            mensagem = "Esgotou suas chances! Nao  acertou! A palavra era '" + palavra.getPalavra() + "'.";
        }

        return mensagem;
    }
}
