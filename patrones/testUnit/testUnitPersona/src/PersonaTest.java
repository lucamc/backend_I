import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonaTest {

    @Test
    public void esPersonaMayorDeEdad() {

        Persona personaPrueba = new Persona("Lucas", 20);

        Assert.assertTrue(personaPrueba.esMayorEdad());
        assertTrue(personaPrueba.esMayorEdad());
    }

}