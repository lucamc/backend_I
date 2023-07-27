package service;

import model.Empleado;
import model.EmpleadoContratado;

public class LiquidadorEmpleadoContratado extends Liquidador{


    @Override
    protected void calcularSueldo(Empleado empleado)  {
        EmpleadoContratado empContratado = (EmpleadoContratado) empleado;
        double sueldo = empContratado.getCantidadHoras() * empContratado.getValorHora();
        empContratado.setSueldoCobrar(sueldo);
    }

    @Override
    protected void imprimirSueldo(Empleado empleado) {
        System.out.println("Documento Digital");
        System.out.println("Empleado " + empleado.getNombre() + " " + empleado.getApellido());
        System.out.println("Sueldo $" + empleado.getSueldoCobrar());
    }
}
