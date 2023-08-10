package model;

public class EmpleadoContratado extends Empleado{

    private double valorHora;
    private int cantidadHoras;


    // CONSTRUCTOR
    public EmpleadoContratado(String nombre, String apellido, String nroCuenta , double valorHora, int cantidadHoras) {
        super(nombre, apellido, nroCuenta);
        this.valorHora = valorHora;
        this.cantidadHoras = cantidadHoras;
    }


    // GETTERS AND SETTERS
    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }
}
