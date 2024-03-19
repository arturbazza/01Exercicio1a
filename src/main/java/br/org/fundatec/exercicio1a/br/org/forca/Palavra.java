package br.org.fundatec.exercicio1a.br.org.forca;

public class Palavra {
    private String palavra;
    private boolean[] letrasDescobertas;

    public Palavra(String palavra) {
        this.palavra = palavra.toUpperCase();
        this.letrasDescobertas = new boolean[palavra.length()];
    }

    public boolean tentativa(char letra) {
        boolean acertou = false;
        letra = Character.toUpperCase(letra);
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == letra) {
                letrasDescobertas[i] = true;
                acertou = true;
            }
        }
        return acertou;
    }

    public String getPalavraAtual() {
        StringBuilder palavraAtual = new StringBuilder();
        for (int i = 0; i < palavra.length(); i++) {
            if (letrasDescobertas[i]) {
                palavraAtual.append(palavra.charAt(i)).append(" ");
            } else {
                palavraAtual.append("_ ");
            }
        }
        return palavraAtual.toString().trim();
    }

    public boolean palavraDescoberta() {
        for (boolean letraDescoberta : letrasDescobertas) {
            if (!letraDescoberta) {
                return false;
            }
        }
        return true;
    }

    public String getPalavra() {
        return palavra;
    }
}
