import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompteurTest {
    @Test
    void testInitialValue() {
        Compteur compteur = new Compteur();
        assertEquals(0, compteur.getCount(), "La valeur initiale doit être 0");
    }

    @Test
    void testIncrement() {
        Compteur compteur = new Compteur();
        compteur.increment();
        assertEquals(1, compteur.getCount(), "Après un incrément, la valeur doit être 1");
        compteur.increment();
        assertEquals(2, compteur.getCount(), "Après deux incréments, la valeur doit être 2");
    }

    @Test
    void testReset() {
        Compteur compteur = new Compteur();
        compteur.increment();
        compteur.increment();
        compteur.reset();
        assertEquals(0, compteur.getCount(), "Après reset, la valeur doit être 0");
    }
}
