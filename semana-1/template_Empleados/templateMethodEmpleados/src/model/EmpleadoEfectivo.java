package model;

public class EmpleadoEfectivo extends Empleado{

    private double sueldoBase;
    private double descuento;
    private double bono;


    // CONSTRUCTOR
    public EmpleadoEfectivo(String nombre, String apellido, String nroCuenta, double sueldoBase, double descuento, double bono) {
        super(nombre, apellido, nroCuenta);
        this.sueldoBase = sueldoBase;
        this.descuento = descuento;
        this.bono = bono;
    }

    // GETTERS AND SETTERS

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
}
