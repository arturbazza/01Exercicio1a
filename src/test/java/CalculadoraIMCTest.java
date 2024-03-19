import static org.junit.jupiter.api.Assertions.*;

import br.org.fundatec.exercicio1a.br.org.calculadoraimc.CalculadoraIMC;
import org.junit.jupiter.api.Test;

public class CalculadoraIMCTest {

    @Test
    public void testCalcularIMC() {
        double peso = 70;
        double altura = 1.75;
        double imc = CalculadoraIMC.calcularIMC(peso, altura);
        assertEquals(22.86, imc, 0.01);
    }
}