package ejemplo;

import org.concordion.integration.junit3.ConcordionTestCase;

public class HolaMundoTest  extends ConcordionTestCase {
    
    public HolaMundoTest() {
        //java.io.tmpdir
        System.setProperty("concordion.output.dir", "target/test-reports/concordion");
    }
    
    public String getSaludo() {
        return "Hola Mundo!";
    }
    
    public String saludoPara(String nombre) {
        return "¡Hola " + nombre + "!";
    }    
}
