package br.org.fundatec.exercicio1a.br.org.conversosmoedas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorMoedasTest {

    @Test
    public void testConverter() {
        assertEquals(100.0, ConversorMoedas.converter(10.0, 10.0), 0.01);
        assertEquals(50.0, ConversorMoedas.converter(10.0, 5.0), 0.01);
        assertEquals(200.0, ConversorMoedas.converter(10.0, 20.0), 0.01);
    }
}
