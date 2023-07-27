package model;

public class Empleado {
    private String nombre;
    private String apellido;
    private String nroCuenta;
    private double sueldoCobrar;


    // CONSTRUCTOR
    public Empleado(String nombre, String apellido, String nroCuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroCuenta = nroCuenta;
    }

    // GETTERS AND SETTERS


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSueldoCobrar() {
        return sueldoCobrar;
    }

    public void setSueldoCobrar(double sueldoCobrar) {
        this.sueldoCobrar = sueldoCobrar;
    }
}
