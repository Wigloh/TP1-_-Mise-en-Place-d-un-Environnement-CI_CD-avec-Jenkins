import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SommeTest {

    @Test
    public void testSomme() {
        Somme somme = new Somme();
        int[] variables = {1, 5, 7};
        int resultat = somme.sommeTableau(variables);
        assertEquals(13, resultat);
    }
}