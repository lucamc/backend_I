package service;

import model.Empleado;
import model.EmpleadoEfectivo;

public class LiquidadorEmpleadoEfectivo extends Liquidador {

    @Override
    protected void calcularSueldo(Empleado empleado) {
        EmpleadoEfectivo empEfectivo = (EmpleadoEfectivo) empleado;
        double sueldo = empEfectivo.getSueldoBase() + empEfectivo.getBono() - empEfectivo.getDescuento();
        empEfectivo.setSueldoCobrar(sueldo);
    }

    @Override
    protected void imprimirSueldo(Empleado empleado) {
        System.out.println("Documento Impreso");
        System.out.println("Empleado " + empleado.getNombre() + " " + empleado.getApellido());
        System.out.println("Sueldo $" + empleado.getSueldoCobrar());
    }
}
