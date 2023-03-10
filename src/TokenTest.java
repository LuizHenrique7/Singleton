
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TokenTest {

    @Test
    public void deveRetornarCPFUsuario() {
        Token.getInstance().setCPFUsuario("123.456.789.12");
        assertEquals("123.456.789.12", Token.getInstance().getCPFUsuario());
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        Token.getInstance().setloginUsuario("Luiz");
        assertEquals("Luiz", Token.getInstance().getloginUsuario());
    }

}