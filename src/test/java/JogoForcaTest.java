import br.org.fundatec.exercicio1a.br.org.old.JogoForca;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JogoForcaTest {

    @Test
    public void testAdivinharLetra() {
        JogoForca jogo = new JogoForca("cachorro");
        assertTrue(jogo.adivinharLetra('c'));
        assertEquals("c_______", jogo.getPalavraAtual());
    }
}
