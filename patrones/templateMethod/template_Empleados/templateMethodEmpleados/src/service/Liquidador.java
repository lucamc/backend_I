package service;

import exception.LiquidadorException;
import model.Empleado;

public abstract class Liquidador {

    public void liquidarSueldo(Empleado empleado) throws LiquidadorException {
        calcularSueldo(empleado);
        if (empleado.getSueldoCobrar() <= 0) {
            throw new LiquidadorException("No se puede calcular liquidación del empleado " + getClass().getName());
        }
        imprimirSueldo(empleado);
        depositarSueldo(empleado);
    }

    private void depositarSueldo(Empleado empleado) {
        System.out.println("Depósito Nro.Cuenta: " + empleado.getNroCuenta());
    }

    protected abstract void calcularSueldo(Empleado empleado);

    protected abstract void imprimirSueldo(Empleado empleado);
}
