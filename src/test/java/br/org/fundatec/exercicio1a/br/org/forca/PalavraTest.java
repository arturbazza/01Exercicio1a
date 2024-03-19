package br.org.fundatec.exercicio1a.br.org.forca;

import static org.junit.jupiter.api.Assertions.*;import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalavraTest {

    @Test
    public void testTentativaCorreta() {
        Palavra palavra = new Palavra("JAVA");
        assertTrue(palavra.tentativa('A'));
        assertEquals("_ A _ A", palavra.getPalavraAtual());
    }

    @Test
    public void testTentativaIncorreta() {
        Palavra palavra = new Palavra("JAVA");
        assertFalse(palavra.tentativa('B'));
        assertEquals("_ _ _ _", palavra.getPalavraAtual());
    }

    @Test
    public void testPalavraAtual() {
        Palavra palavra = new Palavra("PYTHON");
        palavra.tentativa('P');
        palavra.tentativa('Y');
        assertEquals("P Y _ _ _ _", palavra.getPalavraAtual());
    }
}
