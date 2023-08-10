package test;

import exception.LiquidadorException;
import model.EmpleadoEfectivo;
import org.junit.jupiter.api.Test;
import service.Liquidador;
import service.LiquidadorEmpleadoEfectivo;

import static org.junit.jupiter.api.Assertions.*;

class LiquidadorEmpleadoEfectivoTest {

    @Test
    public void CalcularSueldoEmpleadoEfectivoConSueldoBasePremiosDescuento() throws LiquidadorException {
        EmpleadoEfectivo empleadoPrueba = new EmpleadoEfectivo("Martin", "Martini", "4524", 400, 40, 60);
        Liquidador liquidadorPrueba = new LiquidadorEmpleadoEfectivo();

        double sueldoEsperado = empleadoPrueba.getSueldoBase() + empleadoPrueba.getBono() - empleadoPrueba.getDescuento();
        liquidadorPrueba.liquidarSueldo(empleadoPrueba);

        assertEquals(sueldoEsperado, empleadoPrueba.getSueldoCobrar());
    }

}