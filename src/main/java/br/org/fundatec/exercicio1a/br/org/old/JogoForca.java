package br.org.fundatec.exercicio1a.br.org.old;

public class JogoForca {
    private String palavraSecreta;
    private StringBuilder palavraAtual;

    public JogoForca(String palavraSecreta) {
        this.palavraSecreta = palavraSecreta;
        this.palavraAtual = new StringBuilder();
        for (int i = 0; i < palavraSecreta.length(); i++) {
            this.palavraAtual.append("_");
        }
    }

    public boolean adivinharLetra(char letra) {
        boolean acertou = false;
        for (int i = 0; i < palavraSecreta.length(); i++) {
            if (palavraSecreta.charAt(i) == letra) {
                palavraAtual.setCharAt(i, letra);
                acertou = true;
            }
        }
        return acertou;
    }

    public String getPalavraAtual() {
        return palavraAtual.toString();
    }
}
