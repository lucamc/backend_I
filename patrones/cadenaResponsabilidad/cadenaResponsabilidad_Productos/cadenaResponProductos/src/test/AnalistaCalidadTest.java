package test;

import chain.AnalistaCalidadEnvasado;
import chain.AnalistaCalidadLote;
import chain.AnalistaCalidadPeso;
import model.Articulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalistaCalidadTest {

    @Test
    public void validarArticuloSeaAceptandoPasandoPorTodosLosAnalistas() {

        // Articulo de Prueba
        Articulo articuloPrueba = new Articulo("Auto", 1200,1250, "sano");

        // Crear Analistas de Calidad
        AnalistaCalidadLote analistaCalidadLote = new AnalistaCalidadLote();
        AnalistaCalidadPeso analistaCalidadPeso = new AnalistaCalidadPeso();
        AnalistaCalidadEnvasado analistaCalidadEnvasado = new AnalistaCalidadEnvasado();

        // Configurar cadena de Responsabilidad
        analistaCalidadLote.setSiguienteAnalista(analistaCalidadPeso);
        analistaCalidadPeso.setSiguienteAnalista(analistaCalidadEnvasado);

        // Verificar Calidad del producto
        analistaCalidadLote.controlarProducto(articuloPrueba);

        // Aserciones para verificar el resultado
        assertTrue(articuloPrueba.isAceptado());
    }

}