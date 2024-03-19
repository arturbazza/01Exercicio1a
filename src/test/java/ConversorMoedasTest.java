import br.org.fundatec.exercicio1a.br.org.conversosmoedas.ConversorMoedas;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorMoedasTest {

    @Test
    public void testConverter() {
        double valor = 100;
        double taxaCambio = 5.3;
        double valorConvertido = ConversorMoedas.converter(valor, taxaCambio);
        assertEquals(530, valorConvertido, 0.01);
    }
}
