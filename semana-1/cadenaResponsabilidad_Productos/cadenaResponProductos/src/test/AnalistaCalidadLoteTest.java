package test;

import model.Articulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalistaCalidadLoteTest {

    @Test
    public void validarLoteDelProducto() {
        Articulo articuloPrueba = new Articulo("Auto", 0, 1200, "sano");
        Articulo articuloPrueba2 = new Articulo("Auto", 0, 1600, "sano");


        assertTrue(articuloPrueba.getLote() >= 1200 && articuloPrueba.getLote() <= 1300);
        assertTrue(articuloPrueba2.getLote() >= 1200 && articuloPrueba2.getLote() <= 1600);

    }
}