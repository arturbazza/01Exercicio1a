package br.org.fundatec.exercicio1a.br.org.calculadoraimc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraIMCTest {

    @Test
    public void testCalcularIMC() {
        assertEquals(22.22, CalculadoraIMC.calcularIMC(70, 1.75), 0.01);
        assertEquals(26.53, CalculadoraIMC.calcularIMC(85, 1.75), 0.01);
        assertEquals(19.18, CalculadoraIMC.calcularIMC(55, 1.65), 0.01);
    }
}
