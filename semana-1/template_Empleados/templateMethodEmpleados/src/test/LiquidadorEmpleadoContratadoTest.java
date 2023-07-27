package test;

import exception.LiquidadorException;
import model.Empleado;
import model.EmpleadoContratado;
import org.junit.jupiter.api.Test;
import service.Liquidador;
import service.LiquidadorEmpleadoContratado;

import static org.junit.jupiter.api.Assertions.*;

class LiquidadorEmpleadoContratadoTest {

    @Test
    public void calcularSueldoEmpleadoContratadoConHorasYValorValido() throws LiquidadorException {

        Empleado empleadoPrueba = new EmpleadoContratado("Pompilia", "Pompini", "4545", 7, 120);
        Liquidador liquidadorPrueba = new LiquidadorEmpleadoContratado();
        liquidadorPrueba.liquidarSueldo(empleadoPrueba);

        double sueldoEsperado = 7 * 120;

        assertEquals(sueldoEsperado, empleadoPrueba.getSueldoCobrar());

    }
}